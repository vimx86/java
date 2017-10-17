package org.galsang.java.designpattern.create.builder.demoB;

/**
 * Description： 建造者设计模式的案例二
 * <br /> Author： galsang
 */
public class ApiResult {

    private String name;

    private int age;

    private ApiResult(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ApiResult{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApiResult)) return false;

        ApiResult apiResult = (ApiResult) o;

        if (getAge() != apiResult.getAge()) return false;
        return getName() != null ? getName().equals(apiResult.getName()) : apiResult.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class ApiResultBuilder {

        private String name;

        private int age;

        public ApiResultBuilder() {
        }

        public ApiResultBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public ApiResultBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ApiResult builder() {
            return new ApiResult(this.name, this.age);
        }

    }
}

package org.galsang.java.base.books.effective.item12;

/**
 * Description：
 * <br />Author： vimx86
 */
public class PhoneNumber implements Comparable<PhoneNumber>{

    private final short areaCode;

    private final short prefix;

    private final short lineNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNumber == that.lineNumber;
    }


    // Idea 自动生成的 equals 方法
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PhoneNumber that = (PhoneNumber) o;
//        if (areaCode != that.areaCode) return false;
//        if (prefix != that.prefix) return false;
//        return lineNumber == that.lineNumber;
//    }

    // ========================= 常规 hashCode 方法 start ===========
//    @Override
//    public int hashCode() {
//        int result = (int) areaCode;
//        result = 31 * result + (int) prefix;
//        result = 31 * result + (int) lineNumber;
//        return result;
//    }
    // ========================= 常规 hashCode 方法 end ===========


    // ========================= 缓存 hashCode 方法 start ===========
    // 如果散列计算开销大，使用频繁可以考虑缓存 hashCode 值。
    // 使用懒加载的方式初始化，缓存 hashCode.
    private volatile int hashCode;

    @Override
    public int hashCode() {
        int result = hashCode;
        if(result == 0){
            result = (int) areaCode;
            result = 31 * result + (int) prefix;
            result = 31 * result + (int) lineNumber;
            hashCode = result;
        }
        return result;
    }
    // ========================= 缓存 hashCode 方法 end ===========


    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "areaCode");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;

        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + " : " + arg);
        }
    }

//    @Override
//    public int compareTo(PhoneNumber o) {
//
//        if(areaCode < o.areaCode){
//            return -1;
//        }
//        if(areaCode > o.areaCode){
//            return 1;
//        }
//
//        if(prefix < o.prefix){
//            return -1;
//        }
//        if(prefix > o.prefix){
//            return 1;
//        }
//
//        if(lineNumber < o.lineNumber){
//            return -1;
//        }
//        if(lineNumber > o.lineNumber){
//            return 1;
//        }
//        return 0;
//    }

    // 改进优化，，注意：要考虑越界问题。
    @Override
    public int compareTo(PhoneNumber o) {

        int areaCodeDiff = areaCode - o.areaCode;
        if(areaCodeDiff != 0){
            return areaCodeDiff;
        }

        int prefixDiff = prefix - o.prefix;
        if(prefixDiff != 0){
            return prefixDiff;
        }

        return lineNumber - o.lineNumber;
    }
}

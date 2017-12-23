package org.galsang.java.base.books.effective.article9;

/**
 * Description：
 * <br />Author： vimx86
 */
public class PhoneNumber {

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

    @Override
    public int hashCode() {
        int result = (int) areaCode;
        result = 31 * result + (int) prefix;
        result = 31 * result + (int) lineNumber;
        return result;
    }

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

}

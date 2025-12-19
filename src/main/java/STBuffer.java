public class STBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("1234567890");
        System.out.println(stringBuffer);

        stringBuffer.insert(2,",");
        System.out.println(stringBuffer);

        stringBuffer.delete(5,7);
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

    }
}

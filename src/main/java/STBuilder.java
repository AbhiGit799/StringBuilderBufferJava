public class STBuilder {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("ABCDEFGHI");
        System.out.println(stringBuilder);

        stringBuilder.insert(2,",");
        System.out.println(stringBuilder);

        stringBuilder.delete(5, 6);
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }

}

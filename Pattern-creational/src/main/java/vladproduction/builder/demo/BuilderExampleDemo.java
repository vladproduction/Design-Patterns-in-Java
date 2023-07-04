package vladproduction.builder.demo;

public class BuilderExampleDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("This is an example ");
        sb.append("of Builder pattern!\n");
        sb.append("It has methods to append ");
        sb.append("almost anything we want to a String.\n");
        sb.append("/"+2023+"/");
        System.out.println(sb);
    }
}

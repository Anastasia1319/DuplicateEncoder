public class Main {
    public static void main(String[] args) {
        System.out.println(DuplicateEncoder.encode("Prespecialized"));
        System.out.println(DuplicateEncoder.encode("(( @"));

        System.out.println(DuplicateEncoder.encode("Prespecialized").equals(")()())()(()()(")); //compare with the expected result (i.e. should get true everywhere)
        System.out.println(DuplicateEncoder.encode("din").equals("((("));
        System.out.println(DuplicateEncoder.encode("recede").equals("()()()"));
        System.out.println(DuplicateEncoder.encode("Success").equals(")())())"));
        System.out.println(DuplicateEncoder.encode("(( @").equals("))(("));
    }
}
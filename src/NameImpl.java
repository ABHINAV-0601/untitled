public class NameImpl {
    public static void main(String[] args) {
        String name = "Abhinav";

        Name names = new Name() {
            @Override
            public boolean isStartingWithA(String name) {
                return name.charAt(0) == 'A';
            }
        };

        System.out.println(names.isStartingWithA(name));
    }
}

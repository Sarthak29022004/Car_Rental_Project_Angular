public class blockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            a = 30;      //Initialization
            int c = 40;  //declaration
            //you can change original value by initialization, but you can never declare original value => int a = 30 (never)
            //values declared in this block, will remain in this block
        }
        System.out.println(a); // Output => 30
        //System.out.println(c);  you never use value declared in block     output => (error)
        int c = 50;
        System.out.println(c);  //50
    }
}

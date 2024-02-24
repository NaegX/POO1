public class OlaMundo {
    public static void main(String[] args) {
        
        if (args.length > 0 ){
            if (args[0].equals("en")){
                System.out.println("Hello Word");
            }else if (args[0].equals("pt")) {
                System.out.println("Olá mundo"); 
            }else if (args[0].equals("jp")){
                System.out.println("Kon'nichiwa sekai");
            }
        }else{
            System.out.println("Erro");
        }
    }
}
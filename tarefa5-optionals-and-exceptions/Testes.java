import java.util.Optional;

public class Testes {
    public static void main(String[] args) {
        CreateOptional demo1 = new CreateOptional();
        demo1.OfNullableMethod();
        demo1.OfMethod();
        demo1.FilterMethod();

        /*
            Escreva uma nova classe de exceção que utilize dois construtores:
            1) O primeiro com uma mensagem de erro
            2) o segundo que aceite também um Throwable com a causa.
            Faça um exemplo no qual ao capturar uma exceção, gere uma nova exceção passando a exceção original como causa.
            Faça uma demonstração do funcionamento do método getCause da nova exceção que tenha criado.
        */
        try {
            throw new CreateException("Teste Exception 1"  + "\n");
        } catch (CreateException e) {
            System.out.println(e.getMessage());

            try{
                throw new CreateException("Teste Exception 2", e);
            } catch (CreateException err){
                System.out.println(err.getMessage() + " " + err.getCause().getMessage());
            }
        }

        //Faça um exemplo com tratamento várias exceções, cada qual em seu bloco catch.
        try{
            Optional<Integer> opt=Optional.of(null);
        }

        catch (NullPointerException e){
            System.out.println("Exemplo de multiplos blocos catch: " + e);
        }

        catch (Exception e){
            System.out.println("Exemplo de multiplos blocos catch: " + e);
        }

        //Faça um exemplo tratando múltiplas exceções em um mesmo bloco catch, usando o operador "|".
        try{
            Optional<Integer> opt=Optional.of(null);
        }

        catch (NullPointerException|ArithmeticException e){
            System.out.println("Exemplo de bloco catch com multiplas exceções: " + e);
        }
    }
}
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
//import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Joke joke = new Joke();
        JokeLang jokeLang = new JokeLang();
        JokeCategory jokeCategory = new JokeCategory();
        joke.JokeAmount();
        jokeLang.JokeLanguage();
        jokeCategory.JokeCat();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://v2.jokeapi.dev/joke/"+jokeCategory.getCat()+"?lang="+jokeLang.getLang()+"&type=single")).build();
        try{
            for(int i=0; i<joke.getAmount(); i++){
                HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String result = response.body().toString();
                String jajco = result.substring(result.indexOf("\"joke\":")+9);
                String test = jajco.substring(0, jajco.indexOf("\","));
                System.out.println("Joke: "+test+"\n");
                try {
                    FileWriter myWriter = new FileWriter("kawaly.txt", true);
                    myWriter.write(test+"\n \n");
                    myWriter.close();
                  } catch (IOException e) {
                    System.out.println("ERROR.");
                    e.printStackTrace();
                  }
            }
        }
        catch(IOException e){
            System.out.println("Bląd połączenia!");
            e.printStackTrace();
        }
        catch(InterruptedException e ){
            System.out.println("Bląd połączenia!");
            e.printStackTrace();
        }
        
    }

}
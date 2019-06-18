import games.aternos.keystone.database.HTTPGet;

public class test {


    public static void main(String[] args){
        ExampleResolve exampleResolve = new ExampleResolve();
        com.example.Example example = exampleResolve.get(com.example.Example.class);
        System.out.println(example.getTitle());
    }


    static class ExampleResolve extends HTTPGet {

        public ExampleResolve() {
            super("https://jsonplaceholder.typicode.com/posts/1", "");
        }
    }

}

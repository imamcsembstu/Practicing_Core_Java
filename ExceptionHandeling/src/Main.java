import FinallyException.FinallyBlockDemo;

public class Main {
    public static void main(String[] args) throws CheckedException {

        DataFetcher dataFetcher = new DataFetcher();
        String url ="https://google.com";
        dataFetcher.fetchFromUrl(url);


    }
}
import java.util.zip.CheckedInputStream;

public class DataFetcherDemo {
    public void fetchData(){
        DataFetcher dataFetcher = new DataFetcher();

        String url = " https://google.com ";

        dataFetcher.fetchFromUrl(url);
        try {
            dataFetcher.fetchFromUrl(url);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}

package aermias.Weather_API_Project;

public class Query {
    private int count;
    private String created;
    private String lang;
    private Results results;

    public Query() {}

    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }

    public String getCreated() { return created; }
    public void setCreated(String created) { this.created = created; }

    public String getLang() { return lang; }
    public void setLang(String lang) { this.lang = lang; }

    public Results getResults() { return results; }
    public void setResults(Results results) { this.results = results; }
}
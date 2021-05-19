import java.io.File;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class neoFun
{
    private static final File dbDir = new File("C:\\Users\\compu\\.Neo4jDesktop\\neo4jDatabases\\database-3eed76ee-5496-430f-80c8-37850a210d44\\installation-3.5.12");

    private static String queryOne = "MATCH (tom {name: 'Tom Hanks'}) RETURN tom";
    private static String queryTwo = "MATCH (tom:Person {name: 'Tom Hanks'})-[:ACTED_IN]->(tomHanksMovies) RETURN tom,tomHanksMovies";
    private static String queryThree = "MATCH (tom:Person {name: 'Tom Hanks'})-[:ACTED_IN]->(m)<-[:ACTED_IN]-(coActors) RETURN coActors.name LIMIT 10";


    public static void main (String[] args)
    {
        GraphDatabaseService graphdb;
        graphdb = new GraphDatabaseFactory().newEmbeddedDatabase(dbDir);

        System.out.println("Running query: " + queryOne);
        graphdb.execute(queryOne);
        System.out.println("Running query: " + queryTwo);
        graphdb.execute(queryTwo);
        System.out.println("Running query: " + queryThree);
        graphdb.execute(queryThree);

        System.out.println("Queries complete...");

    }
}

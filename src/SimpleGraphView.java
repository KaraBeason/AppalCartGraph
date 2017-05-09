import edu.uci.ics.jung.algorithms.layout.*;
import edu.uci.ics.jung.algorithms.shortestpath.DijkstraShortestPath;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import org.apache.commons.collections15.Transformer;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by karab on 5/8/2017.
 */
    public class SimpleGraphView {
    static Graph<String, Edge> appalRoutes;
    int edgeCount = 0;
    String currentRoute = "";
    static HashMap<String, int[]> hm;


    public SimpleGraphView() {
        appalRoutes = new DirectedSparseMultigraph<>();

        // TEAL ROUTE
        appalRoutes.addEdge(new Edge(1, "teal"), "CottagesBoone3", "CottagesBoone2");
        appalRoutes.addEdge(new Edge(1, "teal"), "CottagesBoone2", "CottagesBoone1");
        appalRoutes.addEdge(new Edge(6, "teal"), "CottagesBoone1", "PoplarGroveRd");
        appalRoutes.addEdge(new Edge(1, "teal"), "PoplarGroveRd", "HighlandCommons");
        appalRoutes.addEdge(new Edge(6, "teal"), "HighlandCommons", "ASUMainEntrance");
        appalRoutes.addEdge(new Edge(1, "teal"), "ASUMainEntrance", "ASUSkywalk");
        appalRoutes.addEdge(new Edge(3, "teal"), "ASUSkywalk", "ASUPeacockHall");
        appalRoutes.addEdge(new Edge(1, "teal"), "ASUPeacockHall", "ASUCAPBuilding");
        appalRoutes.addEdge(new Edge(1, "teal"), "ASUCAPBuilding", "ASUTechnologyCenter");
        appalRoutes.addEdge(new Edge(1, "teal"), "ASUTechnologyCenter", "ASUConvocationCenter");
        appalRoutes.addEdge(new Edge(1, "teal"), "ASUConvocationCenter", "AppSouthApartments");
        appalRoutes.addEdge(new Edge(1, "teal"), "AppSouthApartments", "CasaRustica");
        appalRoutes.addEdge(new Edge(6, "teal"), "CasaRustica", "CottagesBoone3");

        // SILVER ROUTE

        appalRoutes.addEdge(new Edge(1, "silver"), "ASUPeacockHall", "ASUCAPBuilding");
        appalRoutes.addEdge(new Edge(1, "silver"), "ASUCAPBuilding", "ASUTechnologyCenter");
        appalRoutes.addEdge(new Edge(1, "silver"), "ASUTechnologyCenter", "ASUConvocationCenter");
        appalRoutes.addEdge(new Edge(1, "silver"), "ASUConvocationCenter", "AppSouthApartments");
        appalRoutes.addEdge(new Edge(2, "silver"), "AppSouthApartments", "CasaRustica");
        appalRoutes.addEdge(new Edge(1, "silver"), "CasaRustica", "NC105Crosswalk");
        appalRoutes.addEdge(new Edge(1, "silver"), "NC105Crosswalk", "PoplarHillDr");
        appalRoutes.addEdge(new Edge(1, "silver"), "PoplarHillDr", "HeritageCourt");
        appalRoutes.addEdge(new Edge(1, "silver"), "HeritageCourt", "SpeedwayNC105");
        appalRoutes.addEdge(new Edge(1, "silver"), "SpeedwayNC105", "PoplarPoint");
        appalRoutes.addEdge(new Edge(1, "silver"), "PoplarPoint", "WesthavenApts");
        appalRoutes.addEdge(new Edge(1, "silver"), "WesthavenApts", "WhiteOakRd");
        appalRoutes.addEdge(new Edge(1, "silver"), "WhiteOakRd", "CCCTISidewalk");
        appalRoutes.addEdge(new Edge(3, "silver"), "CCCTISidewalk", "CCCTINC105Bypass");
        appalRoutes.addEdge(new Edge(3, "silver"), "CCCTINC105Bypass", "HighlandCommons");
        appalRoutes.addEdge(new Edge(1, "silver"), "HighlandCommons", "SnaggyMountain");
        appalRoutes.addEdge(new Edge(1, "silver"), "SnaggyMountain", "StudioWestApts");
        appalRoutes.addEdge(new Edge(1, "silver"), "StudioWestApts", "HighlandCrossing");
        appalRoutes.addEdge(new Edge(1, "silver"), "HighlandCrossing", "AppalachianPanhellenic");
        appalRoutes.addEdge(new Edge(2, "silver"), "AppalachianPanhellenic", "ASUMainEntrance");
        appalRoutes.addEdge(new Edge(1, "silver"), "ASUMainEntrance", "ASUSkywalk");
        appalRoutes.addEdge(new Edge(1, "silver"), "ASUSkywalk", "ASUPeacockHall");

        // GOLD ROUTE
        appalRoutes.addEdge(new Edge(1, "gold"), "AppalachianHeights", "GreenwoodLot");
        appalRoutes.addEdge(new Edge(2, "gold"),  "GreenwoodLot", "LivingLearningCenter");
        appalRoutes.addEdge(new Edge(1, "gold"), "LivingLearningCenter", "WalkerHall");
        appalRoutes.addEdge(new Edge(1, "gold"), "WalkerHall", "DepotStKingSt");
        appalRoutes.addEdge(new Edge(1, "gold"), "DepotStKingSt", "BooneTownHall");
        appalRoutes.addEdge(new Edge(1, "gold"), "BooneTownHall", "ASUCollegeStStation");
        appalRoutes.addEdge(new Edge(6, "gold"), "ASUCollegeStStation", "HowardStHardinStDanlBoone");
        appalRoutes.addEdge(new Edge(1, "gold"), "HowardStHardinStDanlBoone", "ASUHoeyHallAwning");
        appalRoutes.addEdge(new Edge(1, "gold"), "ASUHoeyHallAwning", "HardinStDauphBlanLn");
        appalRoutes.addEdge(new Edge(1, "gold"), "HardinStDauphBlanLn", "ASUConvocationCenter");
        appalRoutes.addEdge(new Edge(1, "gold"), "ASUConvocationCenter", "FacultySt");
        appalRoutes.addEdge(new Edge(1, "gold"), "FacultySt", "HighlandAve");
        appalRoutes.addEdge(new Edge(2, "gold"), "HighlandAve", "ASUMainEntrance");
        appalRoutes.addEdge(new Edge(1, "gold"), "ASUMainEntrance", "ASUSkywalk");
        appalRoutes.addEdge(new Edge(1, "gold"), "ASUSkywalk", "ASUTrivetteHall");
        appalRoutes.addEdge(new Edge(1, "gold"), "ASUTrivetteHall", "NewlandHall");
        appalRoutes.addEdge(new Edge(1, "gold"), "NewlandHall", "ASUEggersHall");
        appalRoutes.addEdge(new Edge(1, "gold"), "ASUEggersHall", "ASUJusticeHall");
        appalRoutes.addEdge(new Edge(2, "gold"), "ASUJusticeHall", "PeacockTrafficLight");
        appalRoutes.addEdge(new Edge(1, "gold"), "PeacockTrafficLight", "RiversStDepotSt");
        appalRoutes.addEdge(new Edge(1, "gold"), "RiversStDepotSt", "WataugaCountyHumanServices");
        appalRoutes.addEdge(new Edge(1, "gold"), "WataugaCountyHumanServices", "ASUChildCare");
        appalRoutes.addEdge(new Edge(1, "gold"), "ASUChildCare", "ASUAccessRd");
        appalRoutes.addEdge(new Edge(3, "gold"),  "ASUAccessRd", "AppalachianHeights");

        // PURPLE ROUTE
        appalRoutes.addEdge(new Edge(1, "purple"), "ASUPeacockHall", "ASUCAPBuilding");
        appalRoutes.addEdge(new Edge(1, "purple"), "ASUCAPBuilding", "ASUTechnologyCenter");
        appalRoutes.addEdge(new Edge(1, "purple"), "ASUTechnologyCenter", "ASUConvocationCenter");
        appalRoutes.addEdge(new Edge(1, "purple"), "ASUConvocationCenter", "HighlandAve");
        appalRoutes.addEdge(new Edge(1, "purple"), "HighlandAve", "McDonaldsWellsFargo");
        appalRoutes.addEdge(new Edge(1, "purple"), "McDonaldsWellsFargo", "ChinaBuffet");
        appalRoutes.addEdge(new Edge(1, "purple"), "ChinaBuffet", "BooneTownHall");
        appalRoutes.addEdge(new Edge(1, "purple"), "BooneTownHall", "VisitorsCenter");
        appalRoutes.addEdge(new Edge(1, "purple"), "VisitorsCenter", "Applebees");
        appalRoutes.addEdge(new Edge(1, "purple"), "Applebees", "MeadowViewDrAtWalgreens");
        appalRoutes.addEdge(new Edge(3, "purple"), "MeadowViewDrAtWalgreens", "VillageAtMeadowView");
        appalRoutes.addEdge(new Edge(5, "purple"), "VillageAtMeadowView", "MeadowViewDrGreenwayRd");
        appalRoutes.addEdge(new Edge(1, "purple"), "MeadowViewDrGreenwayRd", "GreenwayRdParkingLot");
        appalRoutes.addEdge(new Edge(1, "purple"), "GreenwayRdParkingLot", "GreenwayCommons");
        appalRoutes.addEdge(new Edge(1, "purple"), "GreenwayCommons", "WilsonDr");
        appalRoutes.addEdge(new Edge(1, "purple"), "WilsonDr", "AppalachianPanhellenic");
        appalRoutes.addEdge(new Edge(1, "purple"), "AppalachianPanhellenic", "KangarooExpress");
        appalRoutes.addEdge(new Edge(1, "purple"), "KangarooExpress", "ASUMainEntrance");
        appalRoutes.addEdge(new Edge(1, "purple"), "ASUMainEntrance", "ASUSkywalk");
        appalRoutes.addEdge(new Edge(1, "purple"), "ASUSkywalk", "ASUPeacockHall");

        // Create a hash map
        hm = new HashMap();

        //fill hash map with times for each stop/route
        hm.put("tealCottagesBoone3", new int[]{26, 56, 41, 11});
        hm.put("tealCottagesBoone2", new int[]{27, 57, 42, 12});
        hm.put("tealCottagesBoone1", new int[]{28, 58, 43, 13});
        hm.put("tealPoplarGroveRd", new int[]{32, 2, 47, 17});
        hm.put("tealHighlandCommons", new int[]{33, 3, 48, 18});
        hm.put("tealASUMainEntrance", new int[]{39, 9, 54, 24});
        hm.put("tealASUSkywalk", new int[]{40, 10, 55, 25});
        hm.put("tealASUPeacockHall", new int[]{16, 46, 31, 1});
        hm.put("tealASUCAPBuilding", new int[]{17, 47, 32, 2});
        hm.put("tealASUTechnologyCenter", new int[]{17, 47, 32, 2});
        hm.put("tealASUConvocationCenter", new int[] {18, 48, 33, 3});
        hm.put("tealAppSouthApartments", new int[]{19, 49, 34, 4});
        hm.put("tealCasaRustica", new int[]{20, 50, 35, 5});

        hm.put("silverASUPeacockHall",new int[]{33, 3});
        hm.put("silverASUCAPBuilding", new int[]{34, 4});
        hm.put("silverASUTechnologyCenter", new int[]{34, 4});
        hm.put("silverASUConvocationCenter", new int[]{35, 5});
        hm.put("silverAppSouthApartments", new int[]{36, 6});
        hm.put("silverCasaRustica", new int[]{38, 8});
        hm.put("silverNC105Crosswalk", new int[]{39, 9});
        hm.put("silverPoplarHillDr", new int[]{39, 9});
        hm.put("silverHeritageCourt", new int[]{40, 10});
        hm.put("silverSpeedwayNC105", new int[]{40, 10});
        hm.put("silverPoplarPoint", new int[]{41, 11});
        hm.put("silverWesthavenApts", new int[]{42, 12});
        hm.put("silverWhiteOakRd", new int[]{43, 13});
        hm.put("silverCCCTISidewalk", new int[]{44, 14});
        hm.put("silverCCCTINC105Bypass", new int[] {47, 17});
        hm.put("silverHighlandCommons", new int[]{50, 20});
        hm.put("silverSnaggyMountain", new int[]{51, 21});
        hm.put("silverStudioWestApts", new int[]{52, 22});
        hm.put("silverHighlandCrossing", new int[]{53, 23});
        hm.put("silverAppalachianPanhellenic", new int[]{54, 24});
        hm.put("silverASUMainEntrance", new int[]{56, 26});
        hm.put("silverASUSkywalk", new int[]{57, 27});

        hm.put("goldAppalachianHeights", new int[]{8, 38});
        hm.put("goldGreenwoodLot", new int[]{9, 39});
        hm.put("goldLivingLearningCenter", new int[]{11, 41});
        hm.put("goldWalkerHall", new int[]{12, 42});
        hm.put("goldDepotStKingSt", new int[]{13, 43});
        hm.put("goldBooneTownHall", new int[]{14, 44});
        hm.put("goldASUCollegeStStation", new int[]{50, 20});
        hm.put("goldHowardStHardinStDanlBoone", new int[]{51, 21});
        hm.put("goldASUHoeyHallAwning", new int[]{51, 21});
        hm.put("goldHardinStDauphBlanLn", new int[]{52, 22});
        hm.put("goldASUConvocationCenter", new int[]{53, 23});
        hm.put("goldFacultySt", new int[]{54, 24});
        hm.put("goldHighlandAve", new int[]{54, 24});
        hm.put("goldASUMainEntrance", new int[]{56, 26});
        hm.put("goldASUSkywalk", new int[]{56, 26});
        hm.put("goldASUTrivetteHall", new int[]{57, 27});
        hm.put("goldNewlandHall", new int[]{58, 28});
        hm.put("goldASUEggersHall", new int[]{59, 29});
        hm.put("goldASUJusticeHall", new int[]{0, 30});
        hm.put("goldPeacockTrafficLight", new int[]{2, 32});
        hm.put("goldRiversStDepotSt", new int[]{3, 33});
        hm.put("goldWataugaCountyHumanServices", new int[]{4, 34});
        hm.put("goldASUChildCare", new int[]{5, 35});
        hm.put("goldASUAccessRd", new int[]{5, 36});

        hm.put("purpleASUPeacockHall", new int[]{25, 55, 40, 10});
        hm.put("purpleASUCAPBuilding", new int[]{26, 56, 41, 11});
        hm.put("purpleASUTechnologyCenter", new int[]{27, 57, 42, 12});
        hm.put("purpleASUConvocationCenter", new int[]{28, 58, 43, 13});
        hm.put("purpleHighlandAve", new int[]{29, 59, 44, 14});
        hm.put("purpleMcDonaldsWellsFargo", new int[]{30, 0, 45, 15});
        hm.put("purpleChinaBuffet", new int[]{30, 0, 45, 15});
        hm.put("purpleBooneTownHall", new int[]{31, 1, 46, 16});
        hm.put("purpleVisitorsCenter", new int[]{32, 2, 47, 17});
        hm.put("purpleApplebees", new int[]{32, 2, 47, 17});
        hm.put("purpleMeadowViewDrAtWalgreens", new int[]{33, 3, 48, 18});
        hm.put("purpleVillageAtMeadowView", new int[]{37, 7, 52, 22});
        hm.put("purpleMeadowViewDrGreenwayRd", new int[]{41, 11, 56, 26});
        hm.put("purpleGreenwayRdParkingLot", new int[]{42, 12, 57, 27});
        hm.put("purpleGreenwayCommons", new int[]{44, 14, 59, 29});
        hm.put("purpleWilsonDr", new int[]{45, 15, 0, 30});
        hm.put("purpleAppalachianPanhellenic", new int[]{46, 16, 1, 31});
        hm.put("purpleKangarooExpress", new int[]{47, 17, 2, 32});
        hm.put("purpleASUMainEntrance", new int[]{48, 18, 3, 33});
        hm.put("purpleASUSkywalk", new int[]{49, 19, 4, 34});
        }

    // Creating the AppalCart route graph
    public static void main(String[] args) {

        // Transformer maps the edge name to its color
        Transformer<Edge, Paint> edgeColor = new Transformer<Edge, Paint>() {
            public Paint transform(Edge name) {
                if (name.id.contains("teal")) return new Color(36, 226, 201); /*teal*/
                else if (name.id.contains("silver")) return Color.DARK_GRAY;
                else if (name.id.contains("gold")) return new Color(226, 182, 36); /*gold*/
                else if (name.id.contains("purple")) return new Color(138, 29, 211); /* purple*/
                return Color.RED;
            }
        };

        //Sets the vertex label font
        Transformer<String, Font> vertexFont = new Transformer<String, Font>() {
            public Font transform(String label) {
                Font font = new Font("Calibri", Font.BOLD, 20);
                return font;
            }
        };

        //Sets the vertex color
        Transformer<String, Paint> vertexColor = new Transformer<String, Paint>() {
            public Paint transform(String vertex) {
                return Color.black;
            }
        };
        SimpleGraphView sgv = new SimpleGraphView(); //We create our graph in here
        KKLayout layout = new KKLayout(sgv.appalRoutes);
        VisualizationViewer<String, Edge> vv =
                new VisualizationViewer<String, Edge>(layout);
        // The Layout<V, E> is parameterized by the vertex and edge types
        layout.setSize(new Dimension(500, 500)); // sets the initial size of the space
        // The BasicVisualizationServer<V,E> is parameterized by the edge types
        DefaultModalGraphMouse gm = new DefaultModalGraphMouse();
        gm.setMode(ModalGraphMouse.Mode.TRANSFORMING);
        vv.setGraphMouse(gm);
        vv.setPreferredSize(new Dimension(1000, 1000)); //Sets the viewing area size
        vv.getRenderContext().setEdgeDrawPaintTransformer(edgeColor);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
        vv.getRenderContext().setVertexFontTransformer(vertexFont);
        vv.getRenderContext().setVertexFillPaintTransformer(vertexColor);
        JFrame frame = new JFrame("Simple Graph View");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);

        // Wanted to implement pickSupport but having trouble with graphMouse implmentation, so
        //  console driven for now :(

        Scanner scanner = new Scanner(System.in);
        System.out.print("Where are you getting on? ");
        String vStart = scanner.nextLine();
        System.out.print("Where are you going?");
        String vEnd = scanner.nextLine();
        if (appalRoutes.containsVertex(vStart) && appalRoutes.containsVertex(vEnd))
        {
            sgv.getShortestPath(appalRoutes, vStart, vEnd);
        }
        else System.out.println("Please choose a stop listed on the graph");
        return;
    }


    public void getShortestPath(Graph g, String start, String end) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Transformer<Edge, Integer> wtTransformer = new Transformer<Edge, Integer>() {
            public Integer transform(Edge edge) {
                String route = edge.id.replaceAll("[0-9]", "");
                if (currentRoute == "") {
                    currentRoute = route;
                    return edge.weight;
                }
                else if (currentRoute.equals(route))
                {
                    return edge.weight;
                }
                else if (!currentRoute.equals(route)) {
                    if (hm.get(route + g.getDest(edge)) != null) {
                        int bestTime
                                = getClosestTime(hm.get(route + g.getDest(edge)), cal.getTime());
                        return edge.weight + bestTime;
                    }
                }
                return 0;
            }
        };
        DijkstraShortestPath<String, Edge> alg
                = new DijkstraShortestPath(g, wtTransformer);
        java.util.List<SimpleGraphView.Edge> l = alg.getPath(start, end);
        Number dist = alg.getDistance(start, end);
        System.out.println("The shortest path from"
                + start.toString() + " to " + end.toString() + " is:");
        System.out.println(start.toString());
        for(int i = 0; i < l.size(); i++)
        {
            Edge e = l.get(i);
            System.out.println(e.id.replaceAll("[0-9]", "")
            + " route to " + g.getDest(e).toString());
        }
        System.out.println("Approximate trip time is  " + dist + " minutes.");
    }

    public int getClosestTime(int[] times, Date d){

        int closest = 10000;
        int comparison = 0;
        for (int i = 0; i < times.length; i++)
        {
            if (times[i] < d.getMinutes())
            {
                comparison = 60 - d.getMinutes() + times[i];
            }
            else comparison = times[i] - d.getMinutes();
            if (comparison < closest){
                closest = comparison;
            }
        }
        return  closest;
    }
    class Edge {
        private int weight;
        private String id;
        public Edge(int weight, String route) {
            this.id = route + edgeCount++; // This is defined in the outer class.
            this.weight = weight;
        }
        public int getWeight() {
            return weight;
        }
        public String toString() {
            return id;
        }
    }
}
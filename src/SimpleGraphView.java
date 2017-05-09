import edu.uci.ics.jung.algorithms.layout.*;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import org.apache.commons.collections15.Transformer;
import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Created by karab on 5/8/2017.
 */
    public class SimpleGraphView {
    Graph<String, Edge> appalRoutes;
    int edgeCount = 0;

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
        appalRoutes.addEdge(new Edge(1, "teal"), "ASUConvocationCenter", "AppSouthAparments");
        appalRoutes.addEdge(new Edge(1, "teal"), "AppSouthAparments", "CasaRustica");
        appalRoutes.addEdge(new Edge(6, "teal"), "CasaRustica", "CottagesBoone3");

        // SILVER ROUTE
        appalRoutes.addEdge(new Edge(10, "silver"), "CCCTINC105Bypass", "CCCTISidewalk");
        appalRoutes.addEdge(new Edge(10, "silver"), "CCCTISidewalk", "WhiteOakRd");
        appalRoutes.addEdge(new Edge(10, "silver"), "WhiteOakRd", "HighlandCommons");
        appalRoutes.addEdge(new Edge(10, "silver"), "HighlandCommons", "SnaggyMountain");
        appalRoutes.addEdge(new Edge(10, "silver"), "SnaggyMountain", "StudioWestApts");
        appalRoutes.addEdge(new Edge(10, "silver"), "StudioWestApts", "HighlandCrossing");
        appalRoutes.addEdge(new Edge(10, "silver"), "HighlandCrossing", "AppalachianPanhellenic");
        appalRoutes.addEdge(new Edge(10, "silver"), "AppalachianPanhellenic", "ASUMainEntrance");
        appalRoutes.addEdge(new Edge(10, "silver"), "ASUMainEntrance", "ASUSkywalk");
        appalRoutes.addEdge(new Edge(10, "silver"), "ASUSkywalk", "ASUPeacockHall");
        appalRoutes.addEdge(new Edge(10, "silver"), "ASUPeacockHall", "ASUCAPBuilding");
        appalRoutes.addEdge(new Edge(10, "silver"), "ASUCAPBuilding", "ASUTechnologyCenter");
        appalRoutes.addEdge(new Edge(10, "silver"), "ASUTechnologyCenter", "ASUConvocationCenter");
        appalRoutes.addEdge(new Edge(10, "silver"), "ASUConvocationCenter", "AppSouthApartments");
        appalRoutes.addEdge(new Edge(10, "silver"), "AppSouthApartments", "CasaRustica");
        appalRoutes.addEdge(new Edge(10, "silver"), "CasaRustica", "NC105Crosswalk");
        appalRoutes.addEdge(new Edge(10, "silver"), "NC105Crosswalk", "PoplarHillDr");
        appalRoutes.addEdge(new Edge(10, "silver"), "HeritageCourt", "PoplarHillDr");
        appalRoutes.addEdge(new Edge(10, "silver"), "HeritageCourt", "SpeedwayNC105");
        appalRoutes.addEdge(new Edge(10, "silver"), "PoplarPoint", "SpeedwayNC105");
        appalRoutes.addEdge(new Edge(10, "silver"), "PoplarPoint", "WesthavenApts");
        appalRoutes.addEdge(new Edge(10, "silver"), "WesthavenApts", "CCCTINC105Bypass");

        // GOLD ROUTE
        appalRoutes.addEdge(new Edge(10, "gold"), "BroyhillEvents", "AppalachianHeights");
        appalRoutes.addEdge(new Edge(10, "gold"), "AppalachianHeights", "ASUAccessRd");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUAccessRd", "ASUChildCare");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUChildCare", "WataugaCountyHumanServices");
        appalRoutes.addEdge(new Edge(10, "gold"), "WataugaCountyHumanServices", "WalkerHall");
        appalRoutes.addEdge(new Edge(10, "gold"), "WalkerHall", "LivingLearningCenter");
        appalRoutes.addEdge(new Edge(10, "gold"), "LivingLearningCenter", "ASUAccessRd");
        appalRoutes.addEdge(new Edge(10, "gold"),  "ASUAccessRd", "GreenwoodLot");
        appalRoutes.addEdge(new Edge(10, "gold"),  "GreenwoodLot", "BroyhillEvents");
        appalRoutes.addEdge(new Edge(10, "gold"), "PeacockTrafficLight", "WalkerHall");
        appalRoutes.addEdge(new Edge(10, "gold"),"PeacockTrafficLight", "ASUTrivetteHall");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUTrivetteHall", "NewlandHall");
        appalRoutes.addEdge(new Edge(10, "gold"), "NewlandHall", "ASUEggersHall");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUEggersHall", "ASUJusticeHall");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUJusticeHall", "ASUSkywalk");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUSkywalk", "ASUMainEntrance");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUMainEntrance", "ASUConvocationCenter");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUConvocationCenter", "FacultySt");
        appalRoutes.addEdge(new Edge(10, "gold"), "FacultySt", "HighlandAve");
        appalRoutes.addEdge(new Edge(10, "gold"), "HighlandAve", "HardinStDauphBlanLn");
        appalRoutes.addEdge(new Edge(10, "gold"), "HardinStDauphBlanLn", "ASUHoeyHallAwning");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUHoeyHallAwning", "HowardStHardinStDanlBoone");
        appalRoutes.addEdge(new Edge(10, "gold"), "HowardStHardinStDanlBoone", "ASUCollegeStStation");
        appalRoutes.addEdge(new Edge(10, "gold"), "ASUCollegeStStation", "BooneTownHall");
        appalRoutes.addEdge(new Edge(10, "gold"), "BooneTownHall", "DepotStKingSt");
        appalRoutes.addEdge(new Edge(10, "gold"), "DepotStKingSt", "RiversStDepotSt");
        appalRoutes.addEdge(new Edge(10, "gold"), "RiversStDepotSt", "WalkerHall");

        // PURPLE ROUTE
        appalRoutes.addEdge(new Edge(10, "purple"), "ASUPeacockHall", "ASUCAPBuilding");
        appalRoutes.addEdge(new Edge(10, "purple"), "ASUCAPBuilding", "ASUTechnologyCenter");
        appalRoutes.addEdge(new Edge(10, "purple"), "ASUTechnologyCenter", "ASUConvocationCenter");
        appalRoutes.addEdge(new Edge(10, "purple"), "ASUConvocationCenter", "HighlandAve");
        appalRoutes.addEdge(new Edge(10, "purple"), "HighlandAve", "McDonaldsWellsFargo");
        appalRoutes.addEdge(new Edge(10, "purple"), "McDonaldsWellsFargo", "WilsonDr");
        appalRoutes.addEdge(new Edge(10, "purple"), "WilsonDr", "GreenwayCommons");
        appalRoutes.addEdge(new Edge(10, "purple"), "GreenwayCommons", "GreenwayBusinessPark");
        appalRoutes.addEdge(new Edge(10, "purple"), "GreenwayBusinessPark", "GreenwayRdParkingLot");
        appalRoutes.addEdge(new Edge(10, "purple"), "GreenwayRdParkingLot", "MeadowViewDr");
        appalRoutes.addEdge(new Edge(10, "purple"), "MeadowViewDr", "VillageAtMeadowView");
        appalRoutes.addEdge(new Edge(10, "purple"), "VillageAtMeadowView", "MeadowViewDrAtWalgreens");
        appalRoutes.addEdge(new Edge(10, "purple"), "MeadowViewDrAtWalgreens", "Applebees");
        appalRoutes.addEdge(new Edge(10, "purple"), "Applebees", "VisitorsCenter");
        appalRoutes.addEdge(new Edge(10, "purple"), "VisitorsCenter", "BooneTownHall");
        appalRoutes.addEdge(new Edge(10, "purple"), "BooneTownHall", "ChinaBuffet");
        appalRoutes.addEdge(new Edge(10, "purple"), "ChinaBuffet", "AppalachianPanhellenic");
        appalRoutes.addEdge(new Edge(10, "purple"), "AppalachianPanhellenic", "KangarooExpress");
        appalRoutes.addEdge(new Edge(10, "purple"), "KangarooExpress", "ASUMainEntrance");
        appalRoutes.addEdge(new Edge(10, "purple"), "ASUMainEntrance", "ASUSkywalk");
        appalRoutes.addEdge(new Edge(10, "purple"), "ASUSkywalk", "ASUPeacockHall");
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
        Graph<String, Integer> appalRoutes = new SparseMultigraph<>();
        System.out.println(appalRoutes.toString());
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
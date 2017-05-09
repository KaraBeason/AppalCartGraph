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
import edu.uci.ics.jung.algorithms.layout.*;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import org.apache.commons.collections15.Transformer;

import javax.swing.*;
import javax.swing.SpringLayout;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.peer.ScrollbarPeer;
import java.util.Collection;

/**
 * Created by karab on 5/8/2017.
 */
    public class SimpleGraphView {
        Graph<String, String> appalRoutes;

        public SimpleGraphView() {
            appalRoutes = new SparseMultigraph<>();
//            appalRoutes.addVertex("CottagesBoone1");
//            appalRoutes.addVertex("CottagesBoone2");
//            appalRoutes.addVertex("CottagesBoone3");
//            appalRoutes.addVertex("PoplarGroveRd");
//            appalRoutes.addVertex("HighlandCommons");
//            appalRoutes.addVertex("SnaggyMountain");
//            appalRoutes.addVertex("StudioWest");
//            appalRoutes.addVertex("PoplarPoint");
//            appalRoutes.addVertex("SpeedwayNC105");
//            appalRoutes.addVertex("HeritageCourt");
//            appalRoutes.addVertex("PoplarHillDr");
//            appalRoutes.addVertex("HighlandCrossing");
//            appalRoutes.addVertex("NC105Crosswalk");
//            appalRoutes.addVertex("CasaRustica");
//            appalRoutes.addVertex("VeterinaryClinicWilsonDr");
//            appalRoutes.addVertex("WinklersMeadow");
//            appalRoutes.addVertex("WilsonDrNC105");
//            appalRoutes.addVertex("GreenwayCommons");
//            appalRoutes.addVertex("WinklersCreekRd");
//            appalRoutes.addVertex("BooneCreekDr");
//            appalRoutes.addVertex("GreenwayBusinessPrk");
//            appalRoutes.addVertex("WataugaOppurtunities");
//            appalRoutes.addVertex("MeadowviewDrGreenwayRd");
//            appalRoutes.addVertex("CollegPlace");
//            appalRoutes.addVertex("VillageAtMeadowView");
//            appalRoutes.addVertex("GreenwayRdParkingLot");
//            appalRoutes.addVertex("WalmartOppositeShelter");
//            appalRoutes.addVertex("Applebees");
//            appalRoutes.addVertex("WalmartShelter");
//            appalRoutes.addVertex("MeadowviewDrWalgreens");
//            appalRoutes.addVertex("WataugaMedical");
//            appalRoutes.addVertex("StateFarmRd");
//            appalRoutes.addVertex("BurgerKingBlowingRock");
//            appalRoutes.addVertex("ASUAnnex");
//            appalRoutes.addVertex("BooneHeights");
//            appalRoutes.addVertex("BooneHeightsShoppingCntr");
//            appalRoutes.addVertex("BooneTownHall");
//            appalRoutes.addVertex("ChinaBuffet");
//            appalRoutes.addVertex("ShadowlineRd");
//            appalRoutes.addVertex("UniversityHall");
//            appalRoutes.addVertex("ASUStateFarmLot");
//            appalRoutes.addVertex("610StateFarmRd");
//            appalRoutes.addVertex("IvyTerrace");
//            appalRoutes.addVertex("PapaJohnsPizza");
//            appalRoutes.addVertex("WataugaBuildingSupply");
//            appalRoutes.addVertex("NC105ExtAzaleaDr");
//            appalRoutes.addVertex("AppalachianPanhellenicHall");
//            appalRoutes.addVertex("McDonaldsWellsFargo");
//            appalRoutes.addVertex("KangarooExpress");
//            appalRoutes.addVertex("HighlandAveFacultySt");
//            appalRoutes.addVertex("HighlandAve");
//            appalRoutes.addVertex("FacultySt");
//            appalRoutes.addVertex("AppSouthApartments");
//            appalRoutes.addVertex("ASUConvocationCenter");
//            appalRoutes.addVertex("HornAve");
//            appalRoutes.addVertex("HornWestPrkingLot");
//            appalRoutes.addVertex("HornWestDr");
//            appalRoutes.addVertex("BrownBrothers");
//            appalRoutes.addVertex("HardinStASUConvocation");
//            appalRoutes.addVertex("RedOnionCafe");
//            appalRoutes.addVertex("ASUMainEntrance");
//            appalRoutes.addVertex("ASUHoeyHallAwning");
//            appalRoutes.addVertex("HowardStHardinStDanlBoone");
//            appalRoutes.addVertex("KingStHillsideDr");
//            appalRoutes.addVertex("CollegeStation");
//            appalRoutes.addVertex("WoodCircle");
//            appalRoutes.addVertex("ForestHillsDr");
//            appalRoutes.addVertex("Old421DelmarSt");
//            appalRoutes.addVertex("WataugaHighSchool");
//            appalRoutes.addVertex("SpeedwayHess");
//            appalRoutes.addVertex("HospitalityHouse");
//            appalRoutes.addVertex("PhoenixComplex");
//            appalRoutes.addVertex("BrookhollowRdBluebird");
//            appalRoutes.addVertex("BrookhollowRdBamboo");
//            appalRoutes.addVertex("BambooRd");
//            appalRoutes.addVertex("Old421US421");
//            appalRoutes.addVertex("BrookshireRdPark");
//            appalRoutes.addVertex("IndustrialPark");
//            appalRoutes.addVertex("MountaineerVillageApts");
//            appalRoutes.addVertex("EastVillageSehlter");
//            appalRoutes.addVertex("MeadowhillEstatesEntrance");
//            appalRoutes.addVertex("KingStHardees");
//            appalRoutes.addVertex("KingStFarthingSt");
//            appalRoutes.addVertex("KingswoodApartments");
//            appalRoutes.addVertex("KingStPharmacy");
//            appalRoutes.addVertex("DepotStKingSt");
//            appalRoutes.addVertex("WaterStKingSt");
//            appalRoutes.addVertex("RamsRack");
//            appalRoutes.addVertex("MillerIndustries");
//            appalRoutes.addVertex("PinnacleDrOldBristol");
//            appalRoutes.addVertex("HumanServiceCenter");
//            appalRoutes.addVertex("HighCountryCondos");
//            appalRoutes.addVertex("EdgecliffLn");
//            appalRoutes.addVertex("OldWaterloo");
//            appalRoutes.addVertex("HighlandHall");
//            appalRoutes.addVertex("OakGroveRd");
//            appalRoutes.addVertex("WataugaLawEnforcement");
//            appalRoutes.addVertex("US421OldBristol");
//            appalRoutes.addVertex("RiversStDepotSt");
//            appalRoutes.addVertex("WalkerHall");
//            appalRoutes.addVertex("RecCenter");
//            appalRoutes.addVertex("LivingLearningCenter");
//            appalRoutes.addVertex("MountaineerHall");
//            appalRoutes.addVertex("ASUChildCare");
//            appalRoutes.addVertex("WataugaCountyHumanServices");
//            appalRoutes.addVertex("ASUTechnologyCenter");
//            appalRoutes.addVertex("ASUCAPBuilding");
//            appalRoutes.addVertex("ASUTrivetteHall");
//            appalRoutes.addVertex("ASUEggersHall");
//            appalRoutes.addVertex("NewlandHall");
//            appalRoutes.addVertex("PeacockCircleLight");
//            appalRoutes.addVertex("ASUPeacockHall");
//            appalRoutes.addVertex("WalkerHall");
//            appalRoutes.addVertex("RiversStDepotSt");
//            appalRoutes.addVertex("WalkerHall");
//            appalRoutes.addVertex("LivingLearningCenter");
//            appalRoutes.addVertex("GreenwoodLot");
//            appalRoutes.addVertex("BroyhillInn");
//            appalRoutes.addVertex("BoyhillInnSouth");
//            appalRoutes.addVertex("BrollHillInnEntrance");
//            appalRoutes.addVertex("AppalachianHeights");
//            appalRoutes.addVertex("ASUSkywalk");
//            appalRoutes.addVertex("HardinStDauphBlan");
//            appalRoutes.addVertex("OldBristolRdGilbertBarnes");
//            appalRoutes.addVertex("GeorgeWilsonRd");
//            appalRoutes.addVertex("HubBrownRd");
//            appalRoutes.addVertex("KensingtonMeadows");
//            appalRoutes.addVertex("CCCTISidewalk");
//            appalRoutes.addVertex("CCCTINC105Bypass");
//            appalRoutes.addVertex("WhiteOakRoad");
//            appalRoutes.addVertex("WesthavenApartments");
//            appalRoutes.addVertex("HodgesGapRd");
//            appalRoutes.addVertex("UniversityHighlands");

            // TEAL ROUTE
            appalRoutes.addEdge("teal1", "CottagesBoone1", "CottagesBoone2");
            appalRoutes.addEdge("teal2", "CottagesBoone2", "CottagesBoone3");
            appalRoutes.addEdge("teal3", "CottagesBoone3", "PoplarGroveRd");
            appalRoutes.addEdge("teal12", "PoplarGroveRd", "HighlandCommons");
            appalRoutes.addEdge("teal4", "HighlandCommons", "CasaRustica");
            appalRoutes.addEdge("teal5", "CasaRustica", "AppSouthApartments");
            appalRoutes.addEdge("teal6", "AppSouthApartments", "ASUConvocationCenter");
            appalRoutes.addEdge("teal7", "ASUConvocationCenter", "ASUMainEntrance");
            appalRoutes.addEdge("teal8", "ASUMainEntrance", "ASUTechnologyCenter");
            appalRoutes.addEdge("teal9", "ASUTechnologyCenter", "ASUSkywalk");
            appalRoutes.addEdge("teal10", "ASUSkywalk", "ASUCAPBuilding");
            appalRoutes.addEdge("teal11", "ASUCAPBuilding", "ASUPeacockHall");

            // SILVER ROUTE
            appalRoutes.addEdge("silver1", "CCCTINC105Bypass", "CCCTISidewalk");
            appalRoutes.addEdge("silver2", "CCCTISidewalk", "WhiteOakRd");
            appalRoutes.addEdge("silver3", "WhiteOakRd", "HighlandCommons");
            appalRoutes.addEdge("silver4", "HighlandCommons", "SnaggyMountain");
            appalRoutes.addEdge("silver5", "SnaggyMountain", "StudioWestApts");
            appalRoutes.addEdge("silver6", "StudioWestApts", "HighlandCrossing");
            appalRoutes.addEdge("silver7", "HighlandCrossing", "AppalachianPanhellenic");
            appalRoutes.addEdge("silver8", "AppalachianPanhellenic", "ASUMainEntrance");
            appalRoutes.addEdge("silver9", "ASUMainEntrance", "ASUSkywalk");
            appalRoutes.addEdge("silver10", "ASUSkywalk", "ASUPeacockHall");
            appalRoutes.addEdge("silver11", "ASUPeacockHall", "ASUCAPBuilding");
            appalRoutes.addEdge("silver12", "ASUCAPBuilding", "ASUTechnologyCenter");
            appalRoutes.addEdge("silver13", "ASUTechnologyCenter", "ASUConvocationCenter");
            appalRoutes.addEdge("silver14", "ASUConvocationCenter", "AppSouthApartments");
            appalRoutes.addEdge("silver15", "AppSouthApartments", "CasaRustica");
            appalRoutes.addEdge("silver16", "CasaRustica", "NC105Crosswalk");
            appalRoutes.addEdge("silver17", "NC105Crosswalk", "PoplarHillDr");
            appalRoutes.addEdge("silver18", "HeritageCourt", "PoplarHillDr");
            appalRoutes.addEdge("silver19", "HeritageCourt", "SpeedwayNC105");
            appalRoutes.addEdge("silver20", "PoplarPoint", "SpeedwayNC105");
            appalRoutes.addEdge("silver21", "PoplarPoint", "WesthavenApts");
            appalRoutes.addEdge("silver22", "WesthavenApts", "CCCTINC105Bypass");

            // GOLD ROUTE
            appalRoutes.addEdge("gold1", "BroyhillEvents", "AppalachianHeights");
            appalRoutes.addEdge("gold2", "AppalachianHeights", "ASUAccessRd");
            appalRoutes.addEdge("gold3", "ASUAccessRd", "ASUChildCare");
            appalRoutes.addEdge("gold4", "ASUChildCare", "WataugaCountyHumanServices");
            appalRoutes.addEdge("gold5", "WataugaCountyHumanServices", "WalkerHall");
            appalRoutes.addEdge("gold6", "WalkerHall", "LivingLearningCenter");
            appalRoutes.addEdge("gold7", "LivingLearningCenter", "ASUAccessRd");
            appalRoutes.addEdge("gold26", "ASUAccessRd", "GreenwoodLot");
            appalRoutes.addEdge("gold27", "GreenwoodLot", "BroyhillEvents");
            appalRoutes.addEdge("gold8", "PeacockTrafficLight", "WalkerHall");
            appalRoutes.addEdge("gold9", "PeacockTrafficLight", "ASUTrivetteHall");
            appalRoutes.addEdge("gold10", "ASUTrivetteHall", "NewlandHall");
            appalRoutes.addEdge("gold11", "NewlandHall", "ASUEggersHall");
            appalRoutes.addEdge("gold12", "ASUEggersHall", "ASUJusticeHall");
            appalRoutes.addEdge("gold13", "ASUJusticeHall", "ASUSkywalk");
            appalRoutes.addEdge("gold14", "ASUSkywalk", "ASUMainEntrance");
            appalRoutes.addEdge("gold15", "ASUMainEntrance", "ASUConvocationCenter");
            appalRoutes.addEdge("gold16", "ASUConvocationCenter", "FacultySt");
            appalRoutes.addEdge("gold17", "FacultySt", "HighlandAve");
            appalRoutes.addEdge("gold18", "HighlandAve", "HardinStDauphBlanLn");
            appalRoutes.addEdge("gold19", "HardinStDauphBlanLn", "ASUHoeyHallAwning");
            appalRoutes.addEdge("gold20", "ASUHoeyHallAwning", "HowardStHardinStDanlBoone");
            appalRoutes.addEdge("gold21", "HowardStHardinStDanlBoone", "ASUCollegeStStation");
            appalRoutes.addEdge("gold22", "ASUCollegeStStation", "BooneTownHall");
            appalRoutes.addEdge("gold23", "BooneTownHall", "DepotStKingSt");
            appalRoutes.addEdge("gold24", "DepotStKingSt", "RiversStDepotSt");
            appalRoutes.addEdge("gold25", "RiversStDepotSt", "WalkerHall");

            // PURPLE ROUTE
            appalRoutes.addEdge("purple1", "ASUPeacockHall", "ASUCAPBuilding");
            appalRoutes.addEdge("purple2", "ASUCAPBuilding", "ASUTechnologyCenter");
            appalRoutes.addEdge("purple3", "ASUTechnologyCenter", "ASUConvocationCenter");
            appalRoutes.addEdge("purple4", "ASUConvocationCenter", "HighlandAve");
            appalRoutes.addEdge("purple5", "HighlandAve", "McDonaldsWellsFargo");
            appalRoutes.addEdge("purple6", "McDonaldsWellsFargo", "WilsonDr");
            appalRoutes.addEdge("purple7", "WilsonDr", "GreenwayCommons");
            appalRoutes.addEdge("purple8", "GreenwayCommons", "GreenwayBusinessPark");
            appalRoutes.addEdge("purple9", "GreenwayBusinessPark", "GreenwayRdParkingLot");
            appalRoutes.addEdge("purple10", "GreenwayRdParkingLot", "MeadowViewDr");
            appalRoutes.addEdge("purple11", "MeadowViewDr", "VillageAtMeadowView");
            appalRoutes.addEdge("purple12", "VillageAtMeadowView", "MeadowViewDrAtWalgreens");
            appalRoutes.addEdge("purple13", "MeadowViewDrAtWalgreens", "Applebees");
            appalRoutes.addEdge("purple14", "Applebees", "VisitorsCenter");
            appalRoutes.addEdge("purple15", "VisitorsCenter", "BooneTownHall");
            appalRoutes.addEdge("purple16", "BooneTownHall", "ChinaBuffet");
            appalRoutes.addEdge("purple17", "ChinaBuffet", "AppalachianPanhellenic");
            appalRoutes.addEdge("purple18", "AppalachianPanhellenic", "KangarooExpress");
            appalRoutes.addEdge("purple19", "KangarooExpress", "ASUMainEntrance");
            appalRoutes.addEdge("purple20", "ASUMainEntrance", "ASUSkywalk");
            appalRoutes.addEdge("purple21", "ASUSkywalk", "ASUPeacockHall");
        }

        // Creating the AppalCart route graph
        public static void main(String[] args) {

            // Transformer maps the edge name to its color
            Transformer<String,Paint> edgeColor = new Transformer<String,Paint>() {
                public Paint transform(String name) {
                    if(name.contains("teal")) return new Color(36, 226, 201); /*teal*/
                    else if (name.contains("silver")) return Color.DARK_GRAY;
                    else if (name.contains("gold")) return new Color(226,182, 36); /*gold*/
                    else if (name.contains("purple")) return new Color(138, 29, 211); /* purple*/
                    return Color.RED;
                }
            };
            Graph<String, Integer> appalRoutes = new SparseMultigraph<>();
            System.out.println(appalRoutes.toString());
            SimpleGraphView sgv = new SimpleGraphView(); //We create our graph in here
            // The Layout<V, E> is parameterized by the vertex and edge types
            KKLayout layout = new KKLayout(sgv.appalRoutes);
            layout.setSize(new Dimension(3000, 1600)); // sets the initial size of the space
            // The BasicVisualizationServer<V,E> is parameterized by the edge types
            BasicVisualizationServer<Integer, String> vv =
                    new BasicVisualizationServer<Integer, String>(layout);
            vv.setPreferredSize(new Dimension(3000, 1600)); //Sets the viewing area size
            vv.getRenderContext().setEdgeDrawPaintTransformer(edgeColor);
            vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
            JFrame frame = new JFrame("Simple Graph View");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(vv);
            frame.pack();
            frame.setVisible(true);

        }

    }

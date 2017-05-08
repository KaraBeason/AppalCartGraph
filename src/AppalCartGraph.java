//import edu.uci.ics.jung.algorithms.layout.CircleLayout;
//import edu.uci.ics.jung.algorithms.layout.Layout;
//import edu.uci.ics.jung.graph.Graph;
//import edu.uci.ics.jung.graph.SparseMultigraph;
//import edu.uci.ics.jung.visualization.BasicVisualizationServer;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.Collection;
//
///**
// * Created by karab on 5/8/2017.
// */
//public class AppalCartGraph {
//    public class SimpleGraphView {
//        Graph<String, Integer> appalRoutes;
//
//        public SimpleGraphView() {
//            appalRoutes = new SparseMultigraph<>();
//            appalRoutes.addVertex("CottagesBoone1");
//            appalRoutes.addVertex("CottagesBoone2");
//            appalRoutes.addEdge(1, "CottagesBoone1", "CottagesBoone2");
//            appalRoutes.addVertex("CottagesBoone3");
//            appalRoutes.addEdge(1, "CottagesBoone2", "CottagesBoone3");
//            appalRoutes.addVertex("PoplarGroveRoad");
//            appalRoutes.addEdge(1, "CottagesBoone3", "PoplarGroveRoad");
//            appalRoutes.addVertex("HighlandCommons");
//            appalRoutes.addEdge(1, "PoplarGroveRoad", "HighlandCommons");
//            appalRoutes.addVertex("SnaggyMountain");
//            appalRoutes.addEdge(1, "HighlandCommons", "SnaggyMountain");
//            appalRoutes.addVertex("StudioWest");
//            appalRoutes.addVertex("PoplarPoint");
//            appalRoutes.addVertex("SpeedwayNC105");
//            appalRoutes.addVertex("HeritageCourt");
//            appalRoutes.addVertex("PoplarHillDrive");
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
//        }
//
//        // Creating the AppalCart route graph
//        public static void main(String[] args) {
//            // create a graph using JUNG
//            Graph<String, Integer> appalRoutes = new SparseMultigraph<>();
//            System.out.println(appalRoutes.toString());
//            SimpleGraphView sgv = new SimpleGraphView(); //We create our graph in here
//            // The Layout<V, E> is parameterized by the vertex and edge types
//            Layout<Integer, String> layout = new CircleLayout(sgv.appalRoutes);
//            layout.setSize(new Dimension(300, 300)); // sets the initial size of the space
//            // The BasicVisualizationServer<V,E> is parameterized by the edge types
//            BasicVisualizationServer<Integer, String> vv =
//                    new BasicVisualizationServer<Integer, String>(layout);
//            vv.setPreferredSize(new Dimension(350, 350)); //Sets the viewing area size
//
//            JFrame frame = new JFrame("Simple Graph View");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.getContentPane().add(vv);
//            frame.pack();
//            frame.setVisible(true);
//
//        }
//
//    }
//    }

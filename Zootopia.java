import java.util.Scanner;
public class Zootopia {

        static {
            System.out.println("************************************");
            System.out.println("WELCOME TO ZOOTOPIA");
            System.out.println("     o(*u*)o    ");
            System.out.println("A Store that is full of Surprise ");
            System.out.println("************************************");
            System.out.println("                                          ");
            System.out.println("                                          ");
            System.out.println(" ADDRESS: ");
            System.out.println("          *=* ZOOTOPIA O~O");
            System.out.println("           Near Sai Park, D Y Patil College Road, ");
            System.out.println("            Wagoli");
            System.out.println("           PIN Code 411041. ");
            System.out.println("           PH: 9876543210. ");
            Scanner s = new Scanner(System.in);
            System.out.println("ENTER YOUR NAME");
            String sp = s.nextLine();
            System.out.println("ENTER YOUR CONTACT NO");
            int a = s.nextInt();

        }

        public static void main(String[] args) {
            Zootopia ref = new Zootopia();
            ref.Category();

        }

        public void Category() {
            System.out.println("ENTER 1 TO GET YOUR PET");
            System.out.println("ENTER 2 TO GET TOYS FOR YOUR PET");
            System.out.println("ENTER 3 TO GET FOOD FOR PET");
            System.out.println("ENTER 4 TO VETERNARY BOOKING");
            System.out.println("ENTER 5 FOR VACCINATION BOOKIMG");
            System.out.println("ENTER 6 FOR BUY MEDICINE TO PETS");
            System.out.println("ENTER 7 FOR REGISTRATION OF PETS");
            System.out.println("ENTER 8 FOR WEEKLY EVENT BOOKING");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("WELCOME TO THE PET SECTION");
                        Zootopia c1 = new PetS();// upcasting
                        PetS a1 = (PetS) c1;// downcasting
                        a1.Pets();
                        break;

                    case 2:
                        System.out.println("**WELCOME TO THE GIFTS AND TOYS SECTION**");
                        Zootopia c2 = new TOYS();// upcasting
                        TOYS a2 = (TOYS) c2;// downcasting
                        a2.toys();
                        break;
                    case 3:
                        System.out.println("WELCOME TO THE FOOD SECTION");
                        Zootopia c3 = new FOOD();// upcasting
                        FOOD a3 = (FOOD) c3;// downcasting
                        a3.food();
                        break;
                    case 4:
                        System.out.println("WELCOME TO VETERNARY BOOKING SECTION");
                        Zootopia c4 = new VETERNARY();// upcasting
                        VETERNARY a4 = (VETERNARY) c4;// downcasting
                        a4.Vete();
                        break;

                    case 5:
                        System.out.println("**WEL1COME TO VACCINATION BOOKING SECTION");
                        Zootopia c5 = new VACCINATION();// upcasting
                        VACCINATION a5 = (VACCINATION) c5;// downcasting
                        a5.Vac();
                        break;
                    case 6:
                        System.out.println("WELCOME TO BUY MEDICINE TO PETS SECTION");
                        Zootopia c6 = new MEDICINE();// upcasting
                        MEDICINE a6 = (MEDICINE) c6;// downcasting
                        a6.med();
                        break;
                    case 7:
                        System.out.println("WELCOME TO REGISTRATION OF PETS SECTION");
                        Zootopia c7 = new REG();// upcasting
                        REG a7 = (REG) c7;// downcasting
                        a7.reg();
                        break;

                    case 8:
                        System.out.println("YOU CAN BOOK YOUR TICKET FOR EVENT");
                        Zootopia c8 = new EVENT();// upcasting
                        EVENT a8 = (EVENT) c8;// downcasting
                        a8.event();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class PetS extends Zootopia {
        public void Pets() {
            System.out.println("SELECT WHAT YOU WANT AS YOUR PET");
            System.out.println("ENTER 1 FOR MAMMALIAN PETS");
            System.out.println("ENTER 2 FOR BIRD PETS");
            // System.out.println("ENTER 3 FOR TURTLE PETS");
            System.out.println("ENTER 4 FOR FISH PETS");
            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("WELCOME MAMMALIAN PET SECTION");
                        PetS c1 = new Mammals();// upcasting
                        Mammals b1 = (Mammals) c1;// downcasting
                        b1.Mammal();
                        break;

                    case 2:
                        System.out.println("**WELCOME TO THE BIRD PET SECTION**");
                        Bird c2 = new Bird();// upcasting
                        Bird b2 = (Bird) c2;// downcasting
                        b2.bird();
                        break;
                    case 3:
                        System.out.println("WELCOME TO THE TURTLE PET SECTION");
                        // PetS c3= new Turtle();//upcasting
                        // Turtle a3= (Turtle)c3;//downcasting
                        // a3.turtle();
                        break;
                    case 4:
                        System.out.println("WELCOME TO THE FISH PET SECTION");
                        PetS c3 = new Fish();// upcasting
                        Fish a3 = (Fish) c3;// downcasting
                        a3.fish();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class Bird extends PetS {

        public void bird() {
            System.out.println("SELECT WHAT KIND OF PET YOU WANT :)");
            System.out.println("ENTER 1 to GET COCKATIEL BIRD ");
            System.out.println("ENTER 2 to GET BUDGIES ");
            System.out.println("ENTER 3 to GET CONURE BIRD");
            System.out.println("ENTER 4 to GET MACAW BIRD ");
            System.out.println("ENTER 5 to GET PAROTLE BIRD");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int b = sc.nextInt();

                switch (b) {
                    case 1:
                        System.out.println("WELCOME TO COCKATIEL BIRED SECTION");
                        Bird c1 = new COCKATIEL();// upcasting
                        COCKATIEL b1 = (COCKATIEL) c1;// downcasting
                        b1.cockatiel();
                        break;

                    case 2:
                        System.out.println("WELCOME TO THE BUDGIES BIRED PET SECTION");
                        Bird c2 = new BUDGIES();// upcasting
                        BUDGIES b2 = (BUDGIES) c2;// downcasting
                        b2.budgies();
                        break;
                    case 3:
                        System.out.println("WELCOME TO THE CONURE BIRD PET SECTION");
                        PetS c3 = new COUNRE();// upcasting
                        COUNRE a3 = (COUNRE) c3;// downcasting
                        a3.counre();
                        break;
                    case 4:
                        System.out.println("WELCOME TO THE MACAW BIRD PET SECTION");
                        Bird c4 = new MACAW();// upcasting
                        MACAW a4 = (MACAW) c4;// downcasting
                        a4.macaw();
                        break;
                    case 5:
                        System.out.println("WELCOME TO THE PAROTLE BIRD PET SECTION");
                        Bird c5 = new PAROTLE();// upcasting
                        PAROTLE a5 = (PAROTLE) c5;// downcasting
                        a5.parotl();
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO# NO# SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class COCKATIEL extends Bird {
        public void cockatiel() {
            System.out.println(" YOU HAVE CHOSEN THE COCKATIEL BIRD ");
            System.out.println("ENTER 1 for FEMALE BIRD ");
            System.out.println("ENTER 2 for MALE BIRD");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR BIRD CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED FEMALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED MALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        Bird i = new Bird();
                        i.bird();
                        break;
                    default:
                        System.out.println("-_- NO# NO# SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BUDGIES extends Bird {
        public void budgies() {
            System.out.println(" YOU HAVE CHOSEN THE BUDGIES BIRD ");
            System.out.println("ENTER 1 for FEMALE BIRD ");
            System.out.println("ENTER 2 for MALE BIRD");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR BIRD CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED FEMALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED MALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                    case 12:
                        Bird i = new Bird();
                        i.bird();
                        break;
                    default:
                        System.out.println("-_- NO# NO# SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class COUNRE extends Bird {
        public void counre() {
            System.out.println(" YOU HAVE CHOSEN THE COUNRE BIRD ");
            System.out.println("ENTER 1 for FEMALE BIRD ");
            System.out.println("ENTER 2 for MALE BIRD");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR BIRD CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED FEMALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED MALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        Bird i = new Bird();
                        i.bird();
                        break;
                    default:
                        System.out.println("-_- NO# NO# SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class MACAW extends Bird {
        public void macaw() {
            System.out.println(" YOU HAVE CHOSEN THE MACAW BIRD ");
            System.out.println("ENTER 1 for FEMALE BIRD ");
            System.out.println("ENTER 2 for MALE BIRD");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR BIRD CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED FEMALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED MALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                    case 12:
                        Bird i = new Bird();
                        i.bird();
                        break;
                    default:
                        System.out.println("-_- NO# NO# SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class PAROTLE extends Bird {
        public void parotl() {
            System.out.println(" YOU HAVE CHOSEN THE MACAW BIRD ");
            System.out.println("ENTER 1 for FEMALE BIRD ");
            System.out.println("ENTER 2 for MALE BIRD");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR BIRD CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED FEMALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED MALE BIRD");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 10,000rs - 80,0000rs ");
                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                    case 12:
                        Bird i = new Bird();
                        i.bird();
                        break;
                    default:
                        System.out.println("-_- NO# NO# SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class Mammals extends PetS {

        public void Mammal() {
            System.out.println("SELECT WHAT KIND OF PET YOU WANT :)");
            System.out.println("ENTER 1 to GET CAT ");
            System.out.println("ENTER 2 to GET DOG ");
            // System.out.println("ENTER 3 to GET RABBIT");
            // System.out.println("ENTER 4 to GET HAMMSTER ");
            // System.out.println("ENTER 5 to GET SQUIRREL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int b = sc.nextInt();

                switch (b) {
                    case 1:
                        System.out.println("WELCOME TO CAT SECTION");
                        Mammals c1 = new CAT();// upcasting
                        CAT b1 = (CAT) c1;// downcasting
                        b1.cat();
                        break;

                    case 2:
                        System.out.println("WELCOME TO THE DOG PET SECTION");
                        PetS c2 = new DOG();// upcasting
                        DOG b2 = (DOG) c2;// downcasting
                        b2.dog();
                        break;
                    case 3:
                        System.out.println("WELCOME TO THE RABBIT PET SECTION");
                        // PetS c3= new RABBIT();//upcasting
                        // RABBIT a3= (RABBIT)c3;//downcasting
                        // a3.turtle();
                        break;
                    case 4:
                        System.out.println("WELCOME TO THE FISH PET SECTION");
                        PetS c3 = new Fish();// upcasting
                        Fish a3 = (Fish) c3;// downcasting
                        a3.fish();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;

                    default:
                        System.out.println("-_- NO# NO# SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CAT extends Mammals {
        public void cat() {
            System.out.println("SELECT WHAT BREED YOU WANT ");
            System.out.println("ENTER 1 for PERSIAN CAT ");
            System.out.println("ENTER 2 for RAGDOLL CAT");
            System.out.println("ENTER 3 for SIAMESE CAT");
            System.out.println("ENTER 4 for BOMBAY CAT");
            System.out.println("ENTER 5 for AMERICAN BOTAIL");
            System.out.println("ENTER 6 for BRTISH LONGHAIR");
            System.out.println("ENTER 11 for MAIN CATEGORY");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                // CAT c = new CAT();
                // c.cat();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED PERSIAN CAT");
                        CAT c1 = new Persian();// upcasting
                        Persian b1 = (Persian) c1;// downcasting
                        b1.persian();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED RAGDOLL CAT");
                        CAT c2 = new Ragdoll();// upcasting
                        Ragdoll b2 = (Ragdoll) c2;// downcasting
                        b2.ragdoll();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED SIAMESE CAT");
                        CAT c3 = new SIAMESE();// upcasting
                        SIAMESE a3 = (SIAMESE) c3;// downcasting
                        a3.siamese();
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED BOMBAY CAT");
                        CAT c4 = new BOMBAY();// upcasting
                        BOMBAY a4 = (BOMBAY) c4;// downcasting
                        a4.Bombay_cat();
                        break;
                    case 5:
                        System.out.println("YOU HAVE SELECTED AMERICAN BOINTAIL CAT");
                        CAT c5 = new BOINTAIL();// upcasting
                        BOINTAIL a5 = (BOINTAIL) c5;// downcasting
                        a5.AmericanBointail();
                        break;
                    case 6:
                        System.out.println("YOU HAVE SELECTED BRTISH LONGHAIR CAT");
                        // CAT c6= new British_Longhair();//upcasting
                        // British_Longhair a6= (British_Longhair)c3;//downcasting
                        // a6.Britishlonghair();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class Persian extends CAT {
        public void persian() {
            System.out.println("SELECT WHICH COLOURED CAT YOU WANT ");
            System.out.println("ENTER 1 for BLACK ");

            System.out.println("ENTER 2 for BLUE");
            System.out.println("ENTER 3 for CREAM");
            System.out.println("ENTER 4 for CAMEO(RED) ");
            System.out.println("ENTER 5 for SMOKE TORTOISESHELL");
            System.out.println("ENTER 6 for BLUE-CREAM SMOKE");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                // Persian p = new Persian();
                // p.persian();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR");
                        Persian c1 = new BLACK();// upcasting
                        BLACK b1 = (BLACK) c1;// downcasting
                        b1.black();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR");
                        Persian c2 = new BLUE();// upcasting
                        BLUE b2 = (BLUE) c2;// downcasting
                        b2.blue();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR");
                        Persian c3 = new CREAM();// upcasting
                        CREAM a3 = (CREAM) c3;// downcasting
                        a3.cream();
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED CAMEO(RED) COLOUR");
                        Persian c4 = new CAMEOJ_RED();// upcasting
                        CAMEOJ_RED a4 = (CAMEOJ_RED) c4;// downcasting
                        a4.cameo_red();
                        break;
                    case 5:
                        System.out.println("YOU HAVE SELECTED SMOKE TORTOISESHELL COLOUR");
                        Persian c5 = new SMOKE_TORTOISESHELL();// upcasting
                        SMOKE_TORTOISESHELL a5 = (SMOKE_TORTOISESHELL) c5;// downcasting
                        a5.smoke_tortoiseshell();
                        break;
                    case 6:
                        System.out.println("YOU HAVE SELECTED BLUE-CREAM SMOKE COLOUR");
                        Persian c6 = new BLUECREAM();// upcasting
                        BLUECREAM a6 = (BLUECREAM) c6;// downcasting
                        a6.blue_cream();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    // case 12:
                    // CAT c = new CAT();
                    // c.cat();
                    // break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }

        }

    }

    class BLACK extends Persian {
        public void black() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCELATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR PERSIAN CAT CATEGORY");
            System.out.println("ENTER 13 FOR CAT CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        Persian p = new Persian();
                        p.persian();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BLUE extends Persian {
        public void blue() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR PERSIAN CAT CATEGORY");
            System.out.println("ENTER 13 FOR CAT CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        Persian p = new Persian();
                        p.persian();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CREAM extends Persian {
        public void cream() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR PERSIAN CAT CATEGORY");
            System.out.println("ENTER 13 FOR CAT CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        Persian p = new Persian();
                        p.persian();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CAMEOJ_RED extends Persian {
        public void cameo_red() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR PERSIAN CAT CATEGORY");
            System.out.println("ENTER 13 FOR CAT CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CAMEOJ(RED) COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CAMEOJ(RED) COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 2,500rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        Persian p = new Persian();
                        p.persian();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class SMOKE_TORTOISESHELL extends Persian {
        public void smoke_tortoiseshell() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR PERSIAN CAT CATEGORY");
            System.out.println("ENTER 13 FOR CAT CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED SMOKE_TORTOISESHELL COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED SMOKE_TORTOISESHELL COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        Persian p = new Persian();
                        p.persian();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BLUECREAM extends Persian {
        public void blue_cream() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FPOR CANCEL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR PERSIAN CAT CATEGORY");
            System.out.println("ENTER 13 FOR CAT CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLUE-CREAM COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLUE-CREAM COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The persian cat generally decribe as a quite cat");
                        System.out.println("affectioned to owners");
                        System.out.println("Friendlyness towords strengers,will have fussiness over food");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        Persian p = new Persian();
                        p.persian();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class Ragdoll extends CAT {
        public void ragdoll() {
            System.out.println("SELECT WHICH COLOURED CAT YOU WANT ");
            System.out.println("ENTER 1 for SEAL ");
            System.out.println("ENTER 2 for CREAM ");
            System.out.println("ENTER 3 for BLUE");
            System.out.println("ENTER 4 for LIAC ");
            System.out.println("ENTER 5 for CHOCOLATE");
            System.out.println("ENTER 6 for RED");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                // Ragdoll r = new Ragdoll();
                // r.ragdoll();
                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED SEAL COLOUR");
                        Ragdoll c1 = new SEAL();// upcasting
                        SEAL b1 = (SEAL) c1;// downcasting
                        b1.seal();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR");
                        Ragdoll c2 = new BLUER();// upcasting
                        BLUER b2 = (BLUER) c2;// downcasting
                        b2.blueR();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR");
                        Ragdoll c3 = new CREAMR();// upcasting
                        CREAMR a3 = (CREAMR) c3;// downcasting
                        a3.creamR();
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED LIAC  COLOUR");
                        Ragdoll c4 = new LIAC();// upcasting
                        LIAC a4 = (LIAC) c4;// downcasting
                        a4.liac();
                        break;
                    case 5:
                        System.out.println("YOU HAVE SELECTED CHOCOLATE COLOUR");
                        Ragdoll c5 = new CHOCOLATE();// upcasting
                        CHOCOLATE a5 = (CHOCOLATE) c5;// downcasting
                        a5.chocolate();
                        break;
                    case 6:
                        System.out.println("YOU HAVE SELECTED RED COLOUR");
                        Ragdoll c6 = new RED();// upcasting
                        RED a6 = (RED) c6;// downcasting
                        a6.red();
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        // case 12:
                        // CAT c = new CAT();
                        // c.cat();
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }

        }
    }

    class SEAL extends Ragdoll {
        public void seal() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR RAGDOLL CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED SEAL COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED SEAL COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        Ragdoll r = new Ragdoll();
                        r.ragdoll();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CREAMR extends Ragdoll {
        public void creamR() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOE CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR RAGDOLL CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        Ragdoll r = new Ragdoll();
                        r.ragdoll();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BLUER extends Ragdoll {
        public void blueR() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.print("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR RAGDOLL CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        Ragdoll r = new Ragdoll();
                        r.ragdoll();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class LIAC extends Ragdoll {
        public void liac() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR RAGDOLL CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED LIAC COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED LIAC COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        Ragdoll r = new Ragdoll();
                        r.ragdoll();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CHOCOLATE extends Ragdoll {
        public void chocolate() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR RAGDOLL CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CHOCALTE COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CHOCOLATE COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        Ragdoll r = new Ragdoll();
                        r.ragdoll();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class RED extends Ragdoll {
        public void red() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CAMCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR RAGDOLL CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED REDL COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED RED COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        Ragdoll r = new Ragdoll();
                        r.ragdoll();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class SIAMESE extends CAT {
        public void siamese() {
            System.out.println("SELECT WHICH COLOURED CAT YOU WANT ");
            System.out.println("ENTER 1 for ORANGE ");
            System.out.println("ENTER 2 for CREAM ");
            System.out.println("ENTER 3 for BLUE");
            System.out.println("ENTER 4 for LIAC ");
            System.out.println("ENTER 5 for BROWN");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                // SIAMESE s = new SIAMESE();
                // s.siamese();
                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED ORANGE COLOUR");
                        SIAMESE c1 = new ORANGE();// upcasting
                        ORANGE b1 = (ORANGE) c1;// downcasting
                        b1.orange();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR");
                        SIAMESE c2 = new CREAMS();// upcasting
                        CREAMS b2 = (CREAMS) c2;// downcasting
                        b2.creamS();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR");
                        SIAMESE c3 = new BLUES();// upcasting
                        BLUES a3 = (BLUES) c3;// downcasting
                        a3.blueS();
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED LIAC  COLOUR");
                        SIAMESE c4 = new LIACS();// upcasting
                        LIACS a4 = (LIACS) c4;// downcasting
                        a4.liacS();
                        break;
                    case 5:
                        System.out.println("YOU HAVE SELECTED BROWN COLOUR");
                        SIAMESE c5 = new BROWN();// upcasting
                        BROWN a5 = (BROWN) c5;// downcasting
                        a5.brown();
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    // case 12:
                    // CAT c = new CAT();
                    // c.cat();
                    // break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }

        }
    }

    class ORANGE extends SIAMESE {
        public void orange() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR SIAMESE CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED ORANGE COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The siamese cats are highly intelligent,talkative ");
                        System.out.println("and sociable and friendly.Most popular in europ");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED ORANGE COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The ragdoll cats are gentle,calm and sociable");
                        System.out.println("affectioned without demanding");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");
                        SIAMESE s = new SIAMESE();
                        s.siamese();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CREAMS extends SIAMESE {
        public void creamS() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR SIAMESE CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The siamese cats are highly intelligent,talkative");
                        System.out.println("and sociable and friendly.Most popular in europ");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The siamese cats are highly intelligent,talkative ");
                        System.out.println("and sociable and friendly.Most popular in europ");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");
                        SIAMESE s = new SIAMESE();
                        s.siamese();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BLUES extends SIAMESE {
        public void blueS() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR SIAMESE CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The siamese cats are highly intelligent,talkative");
                        System.out.println("and sociable and friendly.Most popular in europ");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The siamese cats are highly intelligent,talkative ");
                        System.out.println("and sociable and friendly.Most popular in europ");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");
                        SIAMESE s = new SIAMESE();
                        s.siamese();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class LIACS extends SIAMESE {
        public void liacS() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR SIAMESE CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED LIAC COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The siamese cats are highly intelligent,talkative");
                        System.out.println("and sociable and friendly.Most popular in europ");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED LIAC COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The siamese cats are highly intelligent,talkative ");
                        System.out.println("and sociable and friendly.Most popular in europ");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");
                        SIAMESE s = new SIAMESE();
                        s.siamese();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BROWN extends SIAMESE {
        public void brown() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR SIAMESE CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BROWN COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The siamese cats are highly intelligent,talkative");
                        System.out.println("and sociable and friendly.Most popular in europ");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BROWN COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The siamese cats are highly intelligent,talkative ");
                        System.out.println("and sociable and friendly.Most popular in europ");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");
                        SIAMESE s = new SIAMESE();
                        s.siamese();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BOMBAY extends CAT {
        public void Bombay_cat() {
            System.out.println("BOMBAY CATS ARE TIPICALLY CHARACTERIZED AS HAVING AN ALL BLACK ");
            System.out.println(" BLACK COAT,BLACK SOLES,BLACK NOSE AND MOUTH ");
            System.out.println("WITH COPPER OR GREEN EYES");
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Bombay cats is considerd as rare breed");
                        System.out.println("Bombay cats are active and curious ");
                        System.out.println("Bombay cats loves to watch world around her");
                        System.out.println("Bombay cats demands time with her parents");
                        System.out.println("Bombay cats looks a like indian black leopard");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 20,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Bombay cats is considerd as rare breed");
                        System.out.println("Bombay cats are active and curious ");
                        System.out.println("Bombay cats loves to watch world around her");
                        System.out.println("Bombay cats demands time with her parents");
                        System.out.println("Bombay cats looks a like indian black leopard");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    // case 12:
                    // CAT c = new CAT();
                    // c.cat();
                    // break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BOINTAIL extends CAT {
        public void AmericanBointail() {
            System.out.println("SELECT WHICH COLOURED CAT YOU WANT ");
            System.out.println("ENTER 1 for BLACK ");
            System.out.println("ENTER 2 for BLUE");
            System.out.println("ENTER 3 for CREAM");
            System.out.println("ENTER 4 for CAMEO(RED) ");
            System.out.println("ENTER 5 for CREAM WITHOUT WHITE");
            System.out.println("ENTER 6 for BROWN");
            System.out.println("ENTER 7 for CHOCOLATE");
            System.out.println("ENTER 8 for LIAC");
            System.out.println("ENTER 9 for CINNAMON");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                // BOINTAIL k = new BOINTAIL();
                // k.AmericanBointail();
                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR");
                        BOINTAIL c1 = new BLACKB();// upcasting
                        BLACKB b1 = (BLACKB) c1;// downcasting
                        b1.blackB();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR");
                        BOINTAIL c2 = new BLUEB();// upcasting
                        BLUEB b2 = (BLUEB) c2;// downcasting
                        b2.blueB();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR");
                        BOINTAIL c3 = new CREAMB();// upcasting
                        CREAMB a3 = (CREAMB) c3;// downcasting
                        a3.creamB();
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED CAMEO(RED) COLOUR");
                        BOINTAIL c4 = new CAMEO_REDB();// upcasting
                        CAMEO_REDB a4 = (CAMEO_REDB) c4;// downcasting
                        a4.cameo_redB();
                        break;
                    case 5:
                        System.out.println("YOU HAVE SELECTED CREAM WITHOUT WHITE COLOUR");
                        BOINTAIL c5 = new BROWNA();// upcasting
                        BROWNA a5 = (BROWNA) c5;// downcasting
                        a5.browna();
                        break;

                    case 6:
                        System.out.println("YOU HAVE SELECTED BROWN COLOUR");
                        BOINTAIL c6 = new CREAMWHITE();// upcasting
                        CREAMWHITE a6 = (CREAMWHITE) c6;// downcasting
                        a6.creamwhight();
                        break;
                    case 7:
                        System.out.println("YOU HAVE SELECTE CHOCOLATE COLOUR");
                        BOINTAIL c7 = new CHOCOLATEA();// upcasting
                        CHOCOLATEA a7 = (CHOCOLATEA) c7;// downcasting
                        a7.chocolatea();
                        break;
                    case 8:
                        System.out.println("YOU HAVE SELECTED LIAC COLOUR");
                        BOINTAIL c8 = new LIACA();// upcasting
                        LIACA a8 = (LIACA) c8;// downcasting
                        a8.liaca();
                        break;
                    case 9:
                        System.out.println("YOU HAVE SELECTED CINNAMON COLOUR");
                        BOINTAIL c9 = new CINNAMON();// upcasting
                        CINNAMON a9 = (CINNAMON) c9;// downcasting
                        a9.cinnamon();
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    // case 12:
                    // CAT c = new CAT();
                    // c.cat();
                    // break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }

        }
    }

    class BLACKB extends BOINTAIL {
        public void blackB() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR BOINTAI CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println("with dog like personality");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println(" with dog like personality");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;
                    case 13:
                        System.out.println(" ");

                        BOINTAIL b = new BOINTAIL();
                        b.AmericanBointail();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BLUEB extends BOINTAIL {
        public void blueB() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR BOINTAI CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println("with dog like personality");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLUE COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println(" with dog like personality");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        BOINTAIL b = new BOINTAIL();
                        b.AmericanBointail();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CREAMB extends BOINTAIL {
        public void creamB() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR BOINTAI CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println("with dog like personality");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED CREAM COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println(" with dog like personality");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        BOINTAIL b = new BOINTAIL();
                        b.AmericanBointail();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }

    }

    class CAMEO_REDB extends BOINTAIL {
        public void cameo_redB() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR BOINTAI CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CAMEO_REDB  COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println("with dog like personality");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED CAMEO_REDB  COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println(" with dog like personality");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        BOINTAIL b = new BOINTAIL();
                        b.AmericanBointail();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BROWNA extends BOINTAIL {
        public void browna() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR BOINTAI CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BROWN COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println("with dog like personality");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BROWN COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println(" with dog like personality");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        BOINTAIL b = new BOINTAIL();
                        b.AmericanBointail();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CREAMWHITE extends BOINTAIL {
        public void creamwhight() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR BOINTAI CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CREAM WITHOUT WHITE COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println("with dog like personality");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED CREAM WITHOUT WHITE COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println(" with dog like personality");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        BOINTAIL b = new BOINTAIL();
                        b.AmericanBointail();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CHOCOLATEA extends BOINTAIL {
        public void chocolatea() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR BOINTAI CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CHOCOLATE COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println("with dog like personality");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED CHOCOLATE COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println(" with dog like personality");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        BOINTAIL b = new BOINTAIL();
                        b.AmericanBointail();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class LIACA extends BOINTAIL {
        public void liaca() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR BOINTAI CAT CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED LIAC COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println("with dog like personality");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED LIAC COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println(" with dog like personality");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        BOINTAIL b = new BOINTAIL();
                        b.AmericanBointail();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CINNAMON extends BOINTAIL {
        public void cinnamon() {
            System.out.println("ENTER 1 for FEMALE CAT ");
            System.out.println("ENTER 2 for MALE CAT ");
            System.out.println("ENTER 9 FOR CANCEL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR CAT CATEGORY");
            System.out.println("ENTER 13 FOR BOINTAI CAT CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CINNAMON COLOUR FEMALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println("with dog like personality");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED CINNAMON COLOUR MALE CAT");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 18,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Bointail cats are highly intelligent pets");
                        System.out.println(" with dog like personality");
                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        CAT c = new CAT();
                        c.cat();
                        break;

                    case 13:
                        System.out.println(" ");

                        BOINTAIL b = new BOINTAIL();
                        b.AmericanBointail();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class DOG extends Mammals {
        public void dog() {
            System.out.println("SELECT WHAT BREED YOU WANT ");
            System.out.println("ENTER 1 for SIBERIAN HUSKY DOG");
            System.out.println("ENTER 2 for POMERIAN DOG");
            System.out.println("ENTER 3 for LABRATER RETRIVER DOG");
            System.out.println("ENTER 4 for GERMAN SHEPHARD");
            System.out.println("ENTER 5 for ALASKAN MALAMUTE");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                // DOG d = new DOG();
                // d.dog();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED SIBERIAN HUSKY DOG");
                        DOG c1 = new HUSKY();// upcasting
                        HUSKY b1 = (HUSKY) c1;// downcasting
                        b1.husky();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED POMERIAN DOG");
                        DOG c2 = new POMERIAN();// upcasting
                        POMERIAN b2 = (POMERIAN) c2;// downcasting
                        b2.pomerian();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED LABRATER RETRIVER DOG");
                        DOG c3 = new LAB();// upcasting
                        LAB a3 = (LAB) c3;// downcasting
                        a3.lab();
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED GERMAN SHEPHARD");
                        DOG c4 = new SHEPHARD();// upcasting
                        SHEPHARD a4 = (SHEPHARD) c4;// downcasting
                        a4.shephard();
                        break;
                    case 5:
                        System.out.println("YOU HAVE SELECTED ALASKAN MALAMUTE");
                        DOG c5 = new ALASKAN();// upcasting
                        ALASKAN a5 = (ALASKAN) c5;// downcasting
                        a5.alaskan();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;

                }
            }
        }
    }

    class HUSKY extends DOG {
        public void husky() {
            System.out.println("SELECT WHICH COLOURED CAT YOU WANT ");
            System.out.println("ENTER 1 for WHITE ");
            System.out.println("ENTER 2 for BLACK");
            System.out.println("ENTER 3 for GREY");
            System.out.println("ENTER 4 for BLACK & TAN");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED WHITE COLOUR");
                        HUSKY c1 = new WIHTE();// upcasting
                        WIHTE b1 = (WIHTE) c1;// downcasting
                        b1.whitehusky();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR");
                        HUSKY c2 = new BLACKHUSKY();// upcasting
                        BLACKHUSKY b2 = (BLACKHUSKY) c2;// downcasting
                        b2.blackhusky();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED GREY COLOUR");
                        HUSKY c3 = new GREY();// upcasting
                        GREY a3 = (GREY) c3;// downcasting
                        a3.grey();
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED BLACK & TAN COLOUR");
                        HUSKY c4 = new BLACKTAN();// upcasting
                        BLACKTAN a4 = (BLACKTAN) c4;// downcasting
                        a4.blacktan();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    // case 12:
                    // DOG d = new DOG();
                    // d.dog();
                    // break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        Zootopia ref2 = new Zootopia();
                        ref2.Category();
                        break;

                }
            }

        }
    }

    class WIHTE extends HUSKY {
        public void whitehusky() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR HUSKY DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED WIHTE COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Husky dogs are highly intelligent,independent pets");
                        System.out.println("They are free spirited good with people");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED WIHTE COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Husky dogs are highly intelligent,independent pets");
                        System.out.println("They are free spirited good with people");

                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        HUSKY h = new HUSKY();
                        h.husky();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BLACKHUSKY extends HUSKY {
        public void blackhusky() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR LAB DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Husky dogs are highly intelligent,independent pets");
                        System.out.println("They are free spirited good with people");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Husky dogs are highly intelligent,independent pets");
                        System.out.println("They are free spirited good with people");

                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        HUSKY h = new HUSKY();
                        h.husky();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class GREY extends HUSKY {
        public void grey() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR LAB DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED GREY COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Husky dogs are highly intelligent,independent pets");
                        System.out.println("They are free spirited good with people");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED GREY COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Husky dogs are highly intelligent,independent pets");
                        System.out.println("They are free spirited good with people");

                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        HUSKY h = new HUSKY();
                        h.husky();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BLACKTAN extends HUSKY {
        public void blacktan() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR HUSKY DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK & TAN COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Husky dogs are highly intelligent,independent pets");
                        System.out.println("They are free spirited good with people");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLACK & TAN COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("The Husky dogs are highly intelligent,independent pets");
                        System.out.println("They are free spirited good with people");

                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        HUSKY h = new HUSKY();
                        h.husky();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class POMERIAN extends DOG {
        public void pomerian() {
            System.out.println("SELECT WHICH COLOURED DOG YOU WANT ");
            System.out.println("ENTER 1 for WHITE ");
            System.out.println("ENTER 2 for ORANGE ");
            System.out.println("ENTER 3 for BROWN");
            System.out.println("ENTER 4 for TAN");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                // POMERIAN p = new POMERIAN();
                // p.pomerian();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED WHITE COLOUR");
                        POMERIAN c1 = new WIHTEPO();// upcasting
                        WIHTEPO b1 = (WIHTEPO) c1;// downcasting
                        b1.whitepo();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED ORANGE COLOUR");
                        POMERIAN c2 = new ORANGEPO();// upcasting
                        ORANGEPO b2 = (ORANGEPO) c2;// downcasting
                        b2.orangepo();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED BROWN COLOUR");
                        POMERIAN c3 = new BROWNPO();// upcasting
                        BROWNPO a3 = (BROWNPO) c3;// downcasting
                        a3.brownpo();
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED TAN COLOUR");
                        POMERIAN c4 = new TAN();// upcasting
                        TAN a4 = (TAN) c4;// downcasting
                        a4.tan();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        DOG d = new DOG();
                        d.dog();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;

                }
            }

        }
    }

    class WIHTEPO extends POMERIAN {
        public void whitepo() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR POMERIAN DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED WHITE COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Pomerians are known for being smart,curiouse,energetic,feistyand bold");
                        System.out.println("They are very playfull love to be centre of attraction");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED WHITE COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Pomerians are known for being smart,curiouse,energetic,feistyand bold");
                        System.out.println("They are very playfull love to be centre of attraction");

                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;

                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        POMERIAN p = new POMERIAN();
                        p.pomerian();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class ORANGEPO extends POMERIAN {
        public void orangepo() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOE CANCEL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR POMERIAN DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED ORANGE COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Pomerians are known for being smart,curiouse,energetic,feistyand bold");
                        System.out.println("They are very playfull love to be centre of attraction");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED ORANGE COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Pomerians are known for being smart,curiouse,energetic,feistyand bold");
                        System.out.println("They are very playfull love to be centre of attraction");

                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        POMERIAN p = new POMERIAN();
                        p.pomerian();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BROWNPO extends POMERIAN {
        public void brownpo() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCEL");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR POMERIAN DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BROWN COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Pomerians are known for being smart,curiouse,energetic,feistyand bold");
                        System.out.println("They are very playfull love to be centre of attraction");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BROWN COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Pomerians are known for being smat,curiouse,energetic,feistyand bold");
                        System.out.println("They are very playfull love to be centre of attraction");

                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        POMERIAN p = new POMERIAN();
                        p.pomerian();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class TAN extends POMERIAN {
        public void tan() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR POMERIAN DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED TAN COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Pomerians are known for being smart,curiouse,energetic,feistyand bold");
                        System.out.println("They are very playfull love to be centre of attraction");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED TAN COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("===============================================");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Pomerians are known for being smart,curiouse,energetic,feistyand bold");
                        System.out.println("They are very playfull love to be centre of attraction");

                        System.out.println("======================================");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        POMERIAN p = new POMERIAN();
                        p.pomerian();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class LAB extends DOG {
        public void lab() {
            System.out.println("SELECT WHICH COLOURED DOG YOU WANT ");
            System.out.println("ENTER 1 for BLACK ");
            System.out.println("ENTER 2 for CHOCOLATE ");
            System.out.println("ENTER 3 for YELLOW");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                // LAB l = new LAB();
                // l.lab();
                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR");
                        LAB c1 = new BLACKLAB();// upcasting
                        BLACKLAB b1 = (BLACKLAB) c1;// downcasting
                        b1.blacklab();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED CHOCOLATE COLOUR");
                        LAB c2 = new CHOCOLATELAB();// upcasting
                        CHOCOLATELAB b2 = (CHOCOLATELAB) c2;// downcasting
                        b2.chocolatelab();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED YELLOW COLOUR");
                        LAB c3 = new YELLOW();// upcasting
                        YELLOW a3 = (YELLOW) c3;// downcasting
                        a3.yellow();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        DOG d = new DOG();
                        d.dog();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;

                }
            }

        }
    }

    class BLACKLAB extends LAB {
        public void blacklab() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR LAB DOG CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Lab is loyal obidient and playfull");
                        System.out.println("friendly,Outgoing and free spirited");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Lab is loyal obidient and playfull");
                        System.out.println("friendly,Outgoing and free spirited");

                        System.out.println("                                                          ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        LAB l = new LAB();
                        l.lab();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CHOCOLATELAB extends LAB {
        public void chocolatelab() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR LAB DOG CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CHOCOLATE COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Lab is loyal obidient and playfull");
                        System.out.println("friendly,Outgoing and free spirited");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED CHOCOLATE COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Lab is loyal obidient and playfull");
                        System.out.println("friendly,Outgoing and free spirited");

                        System.out.println("                                                          ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        LAB l = new LAB();
                        l.lab();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class YELLOW extends LAB {
        public void yellow() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");

            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR LAB DOG CATEGORY ");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED YELLOW COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Lab is loyal obidient and playfull");
                        System.out.println("friendly,Outgoing and free spirited");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED YELLOW COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("Lab is loyal obidient and playfull");
                        System.out.println("friendly,Outgoing and free spirited");

                        System.out.println("                                                          ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        LAB l = new LAB();
                        l.lab();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class SHEPHARD extends DOG {
        public void shephard() {
            System.out.println("SELECT WHICH COLOURED DOG YOU WANT ");
            System.out.println("ENTER 1 for BLACK ");
            System.out.println("ENTER 2 for GREY ");
            System.out.println("ENTER 3 for BLACK AND GREY");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                // SHEPHARD s = new SHEPHARD();
                // s.shephard();
                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR");
                        SHEPHARD c1 = new BLACKSHE();// upcasting
                        BLACKSHE b1 = (BLACKSHE) c1;// downcasting
                        b1.blackshe();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED GREY COLOUR");
                        SHEPHARD c2 = new GREYSHE();// upcasting
                        GREYSHE b2 = (GREYSHE) c2;// downcasting
                        b2.greyshe();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED BLACK AND GREY COLOUR");
                        SHEPHARD c3 = new BLACKGREY();// upcasting
                        BLACKGREY a3 = (BLACKGREY) c3;// downcasting
                        a3.blackgrey();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        DOG d = new DOG();
                        d.dog();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;

                }
            }

        }
    }

    class BLACKSHE extends SHEPHARD {
        public void blackshe() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR SHEPHARD DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very intelligent ,loyal,alert,confident,");
                        System.out.println("protective,curiouse and stubborn");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLACK COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very intelligent ,loyal,alert,confident,");
                        System.out.println("protective,curiouse and stubborn");

                        System.out.println("                                                          ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        SHEPHARD s = new SHEPHARD();
                        s.shephard();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class GREYSHE extends SHEPHARD {
        public void greyshe() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR SHEPHARD DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED GREY COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very intelligent ,loyal,alert,confident,");
                        System.out.println("protective,curiouse and stubborn");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED GREY COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very intelligent ,loyal,alert,confident,");
                        System.out.println("protective,curiouse and stubborn");

                        System.out.println("                                                          ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        SHEPHARD s = new SHEPHARD();
                        s.shephard();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class BLACKGREY extends SHEPHARD {
        public void blackgrey() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            System.out.println("ENTER 13 FOR SHEPHARD DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED BLACK AND TAN COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very intelligent ,loyal,alert,confident,");
                        System.out.println("protective,curiouse and stubborn");
                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED BLACK AND TAN  COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very intelligent ,loyal,alert,confident,");
                        System.out.println("protective,curiouse and stubborn");

                        System.out.println("                                                          ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        System.out.println(" ");

                        DOG d = new DOG();
                        d.dog();
                        break;
                    case 13:
                        System.out.println(" ");

                        SHEPHARD s = new SHEPHARD();
                        s.shephard();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class ALASKAN extends DOG {
        public void alaskan() {
            System.out.println("SELECT WHICH COLOURED DOG YOU WANT ");
            System.out.println("ENTER 1 for GREY & WHITE ");
            System.out.println("ENTER 2 for SABAL & WHITE ");
            System.out.println("ENTER 3 for WHITE & CHOCOLATE");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR DOG CATEGORY");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                // ALASKAN A = new ALASKAN();
                // A.alaskan();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED GREY & WHITE COLOUR");
                        ALASKAN c1 = new GREYWHITE();// upcasting
                        GREYWHITE b1 = (GREYWHITE) c1;// downcasting
                        b1.greywhite();
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED SABAL & WHITE COLOUR");
                        ALASKAN c2 = new SABALWHITE();// upcasting
                        SABALWHITE b2 = (SABALWHITE) c2;// downcasting
                        b2.sabalwhite();
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED WHITE AND CHOCOLATE COLOUR");
                        ALASKAN c3 = new WHITEALA();// upcasting
                        WHITEALA a3 = (WHITEALA) c3;// downcasting
                        a3.whiteala();
                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        DOG d = new DOG();
                        d.dog();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;

                }
            }

        }
    }

    class GREYWHITE extends ALASKAN {
        public void greywhite() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR  DOG CATEGORY");
            System.out.println("ENTER 13 FOR ALASKAN DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED GREY AND WHITE COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very friendly and devoted affectionate, loyal, and playfull");

                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED GREY AND WHITE  COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very friendly and devoted affectionate, loyal, and playfull");

                        System.out.println("                                                          ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        DOG d = new DOG();
                        d.dog();
                        break;

                    case 13:
                        System.out.println(" ");

                        ALASKAN A = new ALASKAN();
                        A.alaskan();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class SABALWHITE extends ALASKAN {
        public void sabalwhite() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR  DOG CATEGORY");
            System.out.println("ENTER 13 FOR ALASKAN DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED SABAL AND WHITE COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very friendly and devoted affectionate, loyal, and playfull");

                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED SABAL AND WHITE  COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very friendly and devoted affectionate, loyal, and playfull");

                        System.out.println("                                                          ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        DOG d = new DOG();
                        d.dog();
                        break;

                    case 13:
                        System.out.println(" ");

                        ALASKAN A = new ALASKAN();
                        A.alaskan();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class WHITEALA extends ALASKAN {
        public void whiteala() {
            System.out.println("ENTER 1 for FEMALE DOG ");
            System.out.println("ENTER 2 for MALE DOG");
            System.out.println("ENTER 9 FOR CANCELLATION");
            System.out.println("ENTER 11 FOR MAIN CATEGORY");
            System.out.println("ENTER 12 FOR  DOG CATEGORY");
            System.out.println("ENTER 13 FOR ALASKAN DOG CATEGORY ");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("**************************************************************");
                        System.out.println("YOU HAVE SELECTED CHOCOLATE AND WHITE COLOUR FEMALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,0000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very friendly and devoted affectionate, loyal, and playfull");

                        System.out.println("                                                             ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;

                    case 2:
                        System.out.println("YOU HAVE SELECTED CHOCOLATE AND WHITE  COLOUR MALE DOG");
                        System.out.println("PAYMENT DETAILS : ");
                        System.out.println("PRICE : 30,000rs - 80,000rs ");
                        System.out.println("You can pay online also ");
                        System.out.println("                                                          ");
                        System.out.println("CHARACTERSTICS : ");
                        System.out.println("They are very friendly and devoted affectionate, loyal, and playfull");

                        System.out.println("                                                          ");
                        System.out.println("You can come to our house and see or we can also deliver your pet");
                        System.out.println("any qurys regarding anything call on this number given below");
                        System.out.println("9876543210");
                        System.out.println(";) THANK YOU");
                        System.out.println("**************************************************************");

                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    case 12:
                        DOG d = new DOG();
                        d.dog();
                        break;

                    case 13:
                        System.out.println(" ");

                        ALASKAN A = new ALASKAN();
                        A.alaskan();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }

        }
    }

    class Fish extends PetS {
        public void fish() {
            System.out.println("SELECT WHAT BREED YOU WANT ");
            System.out.println("ENTER 1 for FIGHTER FISH ");
            System.out.println("ENTER 2 for GUPPIES FISH");
            System.out.println("ENTER 3 for NEON TETRAS FISH");
            System.out.println("ENTER 4 for ZEBRA DANIOS FISH");
            System.out.println("ENTER 5 for PEARL GOURAMI FISH");
            System.out.println("ENTER 6 for SWORDTAIL FISH");
            System.out.println("ENTER 7 for DISCUS FISH");
            System.out.println("ENTER 8 for PLECOSTOMUS FISH");
            System.out.println("ENTER 9 for BETTAS FISH");
            System.out.println("ENTER 10 for CORYDORAS CATFISH");
            System.out.println("ENTER 11 for ANGELFISH");
            System.out.println("ENTER 12 for MOLLY FISH");
            System.out.println("ENTER 13 for MAIN CATEGORY");

            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YEES WE HAVE FIGHTER FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");
                        break;

                    case 2:
                        System.out.println("YEES WE HAVE GUPPIES FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;
                    case 3:
                        System.out.println("YEES WE HAVE NEON TETRAS FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;
                    case 4:
                        System.out.println("YEES WE HAVE ZEBRA DANIOS FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;
                    case 5:
                        System.out.println("YEES WE HAVE PEARL GOURAMI FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;
                    case 6:
                        System.out.println("YEES WE HAVE SWORDTAIL FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;
                    case 7:
                        System.out.println("YEES WE HAVE DISCUS FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;

                    case 8:
                        System.out.println("YEES WE HAVE PLECOSTOMUS FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;

                    case 9:
                        System.out.println("YEES WE HAVE BETTAS FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;

                    case 10:
                        System.out.println("YEES WE HAVE CORYDORAS CATFISH ");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;

                    case 11:
                        System.out.println("YEES WE HAVE ANGELFISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;

                    case 12:
                        System.out.println("YEES WE HAVE MOLLY FISH");
                        System.out.println("FOR FURTHER INFORMATION YOU CAN CALL ON");
                        System.out.println("CONTACT : 987654310");
                        System.out.println("YOU CAN VISIT OUR HOUSE");
                        System.out.println(":) THANK YOU ");

                        break;

                    case 13:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class TOYS extends Zootopia {
        public void toys() {
            System.out.println("ENTER 1 FOR CAT TOYS");
            System.out.println("ENTER 2 FOR DOG TOYS");

            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("WELCOME CAT TO TOY SECTION");
                        TOYS c1 = new CATTOY();// upcasting
                        CATTOY b1 = (CATTOY) c1;// downcasting
                        b1.Ctoys();
                        break;

                    case 2:
                        System.out.println("**WELCOME TO THE DOG TOY SECTION**");
                        TOYS c2 = new DOGTOY();// upcasting
                        DOGTOY b2 = (DOGTOY) c2;// downcasting
                        b2.Dtoys();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CATTOY extends TOYS {
        public void Ctoys() {
            System.out.println("ENTER 1 FOR TRIXIE TOY");
            System.out.println("ENTER 2 FOR TRIXIE WRIGGLE MOUSE TOY");
            System.out.println("ENTER 3 FOR WOBBLER TOY");
            System.out.println("ENTER 4 FOR LASER CRAZE TOY");
            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED TRIXIE");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELCTEDTRIXIE WRIGGLE MOUSE TOY");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTEDWOBBLER TOY ");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED LASER CRAZY");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class DOGTOY extends TOYS {
        public void Dtoys() {
            System.out.println("ENTER 1 FOR DOG CASINO TOY");
            System.out.println("ENTER 2 FOR TRIXIE WRIGGLE DUCK TOY");
            System.out.println("ENTER 3 FOR FUN BALL TOY");
            System.out.println("ENTER 4 FOR SQUEAKY TOY");
            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED CASINO");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELCTEDTRIXIE WRIGGLE DUCK TOY");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED FUN BALL TOY ");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED SQUEAKY TOY ");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class FOOD extends Zootopia {
        public void food() {
            System.out.println("ENTER 1 FOR CAT FOOD");
            System.out.println("ENTER 2 FOR DOG FOOD");

            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("WELCOME CAT TO FOOD SECTION");
                        FOOD c1 = new CATFOOD();// upcasting
                        CATFOOD b1 = (CATFOOD) c1;// downcasting
                        b1.Cfood();
                        break;

                    case 2:
                        System.out.println("**WELCOME TO THE DOG FOOD SECTION**");
                        FOOD c2 = new DOGFOOD();// upcasting
                        DOGFOOD b2 = (DOGFOOD) c2;// downcasting
                        b2.Dfood();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class DOGFOOD extends FOOD {
        public void Dfood() {
            System.out.println("ENTER 1 FOR DOG PUPPY DRY FOOD");
            System.out.println("ENTER 2 FOR NUTRITION FOOD");
            System.out.println("ENTER 3 FOR PEDIGREE VEGIS AND CHICKEN");
            System.out.println("ENTER 4 FOR MEAT AND MILK");
            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED PUPPY DRY FOOD");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELCTED NUTRITION FOOD");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED PEDIGREE VEGIS AND CHICKEN");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED MEAT AND MILK ");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CATFOOD extends FOOD {
        public void Cfood() {
            System.out.println("ENTER 1 FOR KITTY DRY FOOD");
            System.out.println("ENTER 2 FOR KITTY NUTRITION FOOD");
            System.out.println("ENTER 3 FOR FISH FOOD");
            System.out.println("ENTER 4 FOR CHICKEN FOOD");
            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED KITTY DRY FOOD");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELCTED KITTY NUTRITION FOOD");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED CHICKEN FOOD");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED FISH FOOD ");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");

                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class VETERNARY extends Zootopia {
        public void Vete() {
            System.out.println("ENTER 1 FOR VET BOOKING");
            // System.out.println("ENTER 9 FOR CANCEL");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOUR VETERINARY BOOKING IS DONE");
                        System.out.println("FOR ANY INQUIRE CALL ON : 9876543210");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class VACCINATION extends Zootopia {
        public void Vac() {
            System.out.println("ENTER 1 FOR VET BOOKING");
            try (// System.out.println("ENTER 9 FOR CANCEL");
                 Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOUR VETERINARY BOOKING IS DONE");
                        System.out.println("FOR ANY INQUIRE CALL ON : 9876543210");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class MEDICINE extends Zootopia {
        public void med() {
            System.out.println("ENTER 1 FOR CAT MED");
            System.out.println("ENTER 2 FOR DOG MED");

            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("WELCOME CAT TO MED SECTION");
                        MEDICINE c1 = new CATMED();// upcasting
                        CATMED b1 = (CATMED) c1;// downcasting
                        b1.Cmed();
                        break;

                    case 2:
                        System.out.println("**WELCOME TO THE DOG MED SECTION**");
                        DOGMED c2 = new DOGMED();// upcasting
                        DOGMED b2 = (DOGMED) c2;// downcasting
                        b2.Dmed();
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class DOGMED extends MEDICINE {
        public void Dmed() {
            System.out.println("ENTER 1 FOR DOG GLENAND CHEW");
            System.out.println("ENTER 2 FOR DROOL VITAMIN ");
            System.out.println("ENTER 3 FOR DOG RELIFLAM SPREY");
            System.out.println("ENTER 4 FOR DIGYTON");
            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED  DOG GLENAND CHEW");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELCTED DROOL VITAMIN");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED RELIFLAM SPREY");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED DIYGYTON");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class CATMED extends MEDICINE {
        public void Cmed() {
            System.out.println("ENTER 1 FOR MULTIVITAMIN SYRUP");
            System.out.println("ENTER 2 FOR APPETIZER SYRUP");
            System.out.println("ENTER 3 FOR ORTHORON PASTE(FOR DOGS ALSO)");
            System.out.println("ENTER 4 FOR PETSAN SUPPLIMENTS");
            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE SELECTED MULTIVITAMIN SYRUP");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;

                    case 2:
                        System.out.println("YOU HAVE SELCTED  APPETIZER SYRUP");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 4:
                        System.out.println("YOU HAVE SELECTED PETSAN SUPPLIMENTS");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 3:
                        System.out.println("YOU HAVE SELECTED ORTHORON PASTE(FOR DOGS ALSO) ");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");

                        break;
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class REG extends Zootopia {
        public void reg() {
            System.out.println("ENTER 1 FOR PET REGISTRATION");
            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            try (
                    Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOUR REGISTRATION BOOKING IS DONE");
                        System.out.println("FOR ANY INQUIRE CALL ON : 9876543210");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");
                        break;
                    case 9:
                        System.out.println("CANCELATION IS DONE");
                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;
                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }
    }

    class EVENT extends Zootopia {
        public void event() {
            System.out.println("INFORMATION ABOUT EVENTS ");
            System.out.println("ENTER 11 TO RETURN BACK TO MAIN MAINU");
            System.out.println("1.GROMMING SESSION FOR PETS ");
            System.out.println("                                 ");
            System.out.println("2.PET PARED ");
            System.out.println("                                 ");
            System.out.println("3.PET PLAY DAY");
            System.out.println("                                 ");
            System.out.println("4.MY FASHIONABLE PET");
            System.out.println("                                 ");
            System.out.println("5.POOL PART");
            System.out.println("                                 ");
            System.out.println("6.YUPPY HOUR");
            System.out.println("                                 ");
            System.out.println("                                 ");
            System.out.println("ENTER 1 FOR BOOK TICKET AS A PARTICIPENT");
            System.out.println("FEES : 1000/- PER DUO");
            System.out.println("FOR ANY INQUIRE CALL ON : 9876543210");
            System.out.println("                                 ");
            System.out.println("                                 ");
            System.out.println("                                 ");
            System.out.println("ENTER 2 FOR BOOK TICKET AS AUDIOUNCE");
            System.out.println("FEES : 400/- PER person");
            System.out.println("FOR ANY INQUIRE CALL ON : 9876543210");
            System.out.println("                                 ");
            System.out.println("                                 ");
            System.out.println(" ENTER 1 TO GET YOUR TICKET");
            try (Scanner sc = new Scanner(System.in)) {
                int a = sc.nextInt();

                switch (a) {
                    case 1:
                        System.out.println("YOU HAVE BOOKED THE TICKET AS PARTICIPENT ");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");

                        break;

                    case 2:
                        System.out.println("YOU HAVE BOOKED THE TICKET AS audiounce ");
                        System.out.println(" THANK YOU VISIT AGAIN ;) ");

                        break;

                    case 11:
                        System.out.println(" ");

                        Zootopia ref = new Zootopia();
                        ref.Category();
                        break;

                    default:
                        System.out.println("-_- NO NO SOMETHING IS WRONG");
                        break;
                }
            }
        }

    }
package facade;

public class FacadeFactory {

    public static class Facade implements IFacade{
        private static Facade instance = new Facade();

        @Override
        public int getValue() {
            return BusinessDAO.load();
        }

        @Override
        public void updateValue(int value) {
            BusinessDAO.update(value);
        }

        public static class BusinessRules{
            private static int rules=5;
            public BusinessRules(){

            }
            public static int getRules() {
                return rules;
            }
        }
        public static class BusinessValidation{

            public BusinessValidation(){
            }
            public static boolean isValidRequest(int value){
                 if(BusinessRules.getRules()>value){
                     return true;
                 }
                return  false;
            }
        }
        public static class BusinessDAO{
            private static int db;
            public BusinessDAO(){

            }
            public static void update(int value){
                if(BusinessValidation.isValidRequest(value)){
                    db=value;
                }
            }
            public static int load(){
                return db;
            }
        }
        public Facade(){

        }
    }
    public IFacade getFacade(){
        return Facade.instance;
    }
}

public class SeniorManager implements  ReqHandler{
    private ReqHandler reqHandler;

    @Override
    public void setNextHandler(ReqHandler reqHandler) {
        this.reqHandler=reqHandler;
    }

    @Override
    public void reqHandle(int level) {
        if(level == 3){
            System.out.println("Req handled by Senior Manager");
        }
        else {
            System.out.println("Req transfered by Senior Manager");
            reqHandler.reqHandle(level);
        }
    }
    
}
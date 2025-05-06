public interface ReqHandler{
    public void setNextHandler(ReqHandler reqHandler);
    public void reqHandle(int level);
}
    

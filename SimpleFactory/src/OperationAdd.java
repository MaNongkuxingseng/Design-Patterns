
public class OperationAdd extends Operation{

    @Override
    int Calculate() {
        int result = getNumberA() + getNumberB();
        return result;
    }

}

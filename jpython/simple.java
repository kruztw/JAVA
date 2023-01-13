import org.python.util.PythonInterpreter;

public class simple {
    public static void main(String[] args) throws InterruptedException {
	    try(PythonInterpreter pyInterp = new PythonInterpreter()) {
	        pyInterp.exec("print('Hello Python World!')");
	    }
    }
}

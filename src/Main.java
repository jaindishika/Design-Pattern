import com.designPattern.AdapterPattern.CaramelFilter;
import com.designPattern.AdapterPattern.Image;
import com.designPattern.AdapterPattern.ImageView;
import com.designPattern.AdapterPattern.avaFilters.Caramel;
import com.designPattern.Command.AddCustomerCommand;
import com.designPattern.Command.CustomerService;
import com.designPattern.Command.fw.Button;
import com.designPattern.Memento.Editor;
import com.designPattern.Memento.History;
import com.designPattern.decorator.CloudStream;
import com.designPattern.decorator.CompressedCloudStream;
import com.designPattern.decorator.EncryptedCloudStream;
import com.designPattern.decorator.Stream;
import com.designPattern.state.BrushTool;
import com.designPattern.state.Canvas;
import com.designPattern.strategy.BlackAndWhiteFilter;
import com.designPattern.strategy.ImageStorage;
import com.designPattern.strategy.JpegCompressor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Memento Pattern
//        var editor = new Editor();
//        var history = new History();
//        editor.setContent("a");
//        history.push(editor.createState());
//        editor.setContent("b");
//        history.push(editor.createState());
//        editor.setContent("c");
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());


//        State Design Pattern
//        var canvas = new Canvas();
//        canvas.setCurrentTool(new BrushTool());
//        canvas.mouseDown();
//        canvas.mouseUp();


//        Strategy Design Pattern
//        var ImageStorage = new ImageStorage(
//                new JpegCompressor(), new BlackAndWhiteFilter()
//        );
//        ImageStorage.store("a");

//        Command Design Pattern
//          var service = new CustomerService();
//          var command = new AddCustomerCommand(service);
//          var button = new Button(command);
//          button.click();

//        Adapter Pattern
//        var ImageView = new ImageView(new Image());
//        ImageView.apply(new CaramelFilter(new Caramel()));

//        Decorator Pattern
        StoreCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));

    }
    public static void StoreCreditCard(Stream stream){
        stream.write("123-456-789");
    }
}
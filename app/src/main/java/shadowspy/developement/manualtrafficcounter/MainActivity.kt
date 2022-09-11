package shadowspy.developement.manualtrafficcounter

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tsLong = System.currentTimeMillis() / 1000
        val ts = tsLong.toString()

        //Value for all button counter
        val buttonCar1 = findViewById<Button>(R.id.btnCar1)
        val buttonCar2 = findViewById<Button>(R.id.btnCar2)
        val buttonMotorcycle1 = findViewById<Button>(R.id.btnMotocyle1)
        val buttonMotorcycle2 = findViewById<Button>(R.id.btnMotocyle2)
        val buttonTruck1 = findViewById<Button>(R.id.btnTruck1)
        val buttonTruck2 = findViewById<Button>(R.id.btnTruck2)
        val buttonBus1 = findViewById<Button>(R.id.btnBus1)
        val buttonBus2 = findViewById<Button>(R.id.btnBus2)

        //Value for reset button
        val buttonReset = findViewById<Button>(R.id.btnReset)

        //Value for mode button
        val buttonMode = findViewById<Button>(R.id.btnMode)

        //Variable to store counter
        var car = 0
        var motorcycle = 0
        var bus = 0
        var truck =0

        //Variable to store add or reduction mode
        var mode = true

        var logList = mutableListOf<String>()

        //Button Listener For Car
        buttonCar1.setOnClickListener{
            if(mode){
                car ++
                logList.add(" $car Car recorded at $ts")
            }else car--
            logList.add(" $car Car recorded")
            buttonCar1.setText("CAR : $car")
            buttonCar2.setText("CAR : $car")
        }
        buttonCar2.setOnClickListener{
            if(mode){
                car ++
                logList.add(" $car Car recorded at $ts")
            }else car --
            logList.add(" $car Car recorded")
            buttonCar1.setText("CAR : $car")
            buttonCar2.setText("CAR : $car")
        }

        //Button Listener for Motorcycle
        buttonMotorcycle1.setOnClickListener{
            if(mode){
                motorcycle ++
                logList.add(" $motorcycle Motorcycle recorded at $ts")
            }else motorcycle --
            logList.add(" $motorcycle Motorcycle recorded at $ts")
            buttonMotorcycle1.setText("MOTORCYCLE : $motorcycle")
            buttonMotorcycle2.setText("MOTORCYCLE : $motorcycle")
        }
        buttonMotorcycle2.setOnClickListener{
            if(mode){
                motorcycle ++
                logList.add(" $motorcycle Motorcycle recorded at $ts")
            }else motorcycle --
            logList.add(" $motorcycle Motorcycle recorded at $ts")
            buttonMotorcycle1.setText("MOTORCYCLE : $motorcycle")
            buttonMotorcycle2.setText("MOTORCYCLE : $motorcycle")
        }

        //Button Listener for Truck
        buttonTruck1.setOnClickListener{
            if(mode){
                truck ++
                logList.add(" $truck Truck recorded at $ts")
            }else truck --
            logList.add(" $truck Truck recorded at $ts")
            buttonTruck1.setText("TRUCK : $truck")
            buttonTruck2.setText("TRUCK : $truck")
        }
        buttonTruck2.setOnClickListener{
            if(mode){
                truck ++
                logList.add(" $truck Truck recorded at $ts")
            }else truck --
            logList.add(" $truck Truck recorded at $ts")
            buttonTruck1.setText("TRUCK : $truck")
            buttonTruck2.setText("TRUCK : $truck")
        }

        //Button Listener for Bus
        buttonBus1.setOnClickListener {
            if(mode){
                bus ++
                logList.add(" $bus Bus recorded at $ts")
            }else bus --
            logList.add(" $bus Bus recorded at $ts")
            buttonBus1.setText("BUS : $bus")
            buttonBus2.setText("BUS : $bus")
        }
        buttonBus2.setOnClickListener {
            if(mode){
                bus ++
                logList.add(" $bus Bus recorded at $ts")
            }else bus --
            logList.add(" $bus Bus recorded at $ts")
            buttonBus1.setText("BUS : $bus")
            buttonBus2.setText("BUS : $bus")
        }

        //Button Listener for Reset
        buttonReset.setOnClickListener{
            motorcycle = 0
            car = 0
            bus = 0
            truck = 0
            buttonCar1.setText("CAR : $car")
            buttonCar2.setText("CAR : $car")
            buttonMotorcycle1.setText("MOTORCYCLE : $motorcycle")
            buttonMotorcycle2.setText("MOTORCYCLE : $motorcycle")
            buttonTruck1.setText("TRUCK : $truck")
            buttonTruck2.setText("TRUCK : $truck")
            buttonBus1.setText("BUS : $bus")
            buttonBus2.setText("BUS : $bus")
        }

        //Button Listener for Mode
        buttonMode.setOnClickListener{
            if(mode) {
                mode = false;
                buttonMode.setText("REDUCTION MODE");
                buttonMode.setBackgroundColor(Color.RED)
            }else {
                mode = true;
                buttonMode.setText("ADD MODE");
                buttonMode.setBackgroundColor(Color.GREEN)
            }

        }

    }
}
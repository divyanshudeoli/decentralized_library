import java.util.prefs.Preferences;

public class DataClass {

public void createPreference(String name, int value) {
    Preferences prefs = Preferences.userNodeForPackage(DataClass.class);
    if (prefs.getInt(name, -1) == -1) {
        prefs.putInt(name, value);
        System.out.println("Created For you, "+name+" with value: "+value);
    } else {
        System.out.println("Already Exist");
    }
}

public int readPreference(String name) {
    Preferences prefs = Preferences.userNodeForPackage(DataClass.class);
    return prefs.getInt(name, -1);
}

public void updatePreference(String name) {
    Preferences prefs = Preferences.userNodeForPackage(DataClass.class);
    int val = prefs.getInt(name, -1);
    if (val != -1) {
        val++;
        prefs.remove(name);
        prefs.putInt(name, val);
        System.out.println("New Value of "+name+" is: "+prefs.getInt(name, -1));
    }
}

public void removePreference(String key) {
    Preferences prefs = Preferences.userNodeForPackage(DataClass.class);
    if(prefs.getInt(key, -1) != -1){
        prefs.remove(key);
        System.out.println("Removed: "+key);
    }else{
        System.out.println("No Such Data in: "+key);
    }
}

}
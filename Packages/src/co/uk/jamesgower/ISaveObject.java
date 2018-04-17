package co.uk.jamesgower;

import java.util.List;

/**
 * Created by james on 26/06/2017.
 */
public interface ISaveObject {
    List<String> write();
    void read(List<String> savedValues);
}

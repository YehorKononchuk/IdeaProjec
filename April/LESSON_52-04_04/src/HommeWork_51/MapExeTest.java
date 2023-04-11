package HommeWork_51;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MapExeTest {
    private MapExe mapExe;

    @BeforeEach
    public void init(){
        mapExe = new MapExe();
    }

    public void wordMultiple_test_true(){
        String[]  actual = new String[]{"a","b","a","c","b"};

        Map<String, Boolean> exepted = new HashMap<>();
        exepted.put("a",true);
        exepted.put("b",true);
        exepted.put("c",true);

        assertEquals(exepted,mapExe.wordMultiple(actual));
    }
    @Test
    public void wordMultiple_test_same(){
        String[]  actual = new String[]{"c","c","c","c","c"};

        Map<String, Boolean> exepted = new HashMap<>();
        exepted.put("c",true);

        assertEquals(exepted,mapExe.wordMultiple(actual));
    }
    @Test
    public void wordMultiple_test_allFalse(){
        String[]  actual = new String[]{"a","b","c"};

        Map<String, Boolean> exepted = new HashMap<>();
        exepted.put("c",true);

        assertEquals(exepted,mapExe.wordMultiple(actual));
    }




}
package org.howe.bootgrid.web;

import org.howe.bootgrid.domain.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DataController {

    @RequestMapping("/data")
    public List<Data> data() {
        List<Data> data = new ArrayList<>();
        for (int i = 0; i < 100; i++ ) {
            data.add(new Data(i, "Name " + i));
        }
        return data;
    }
}

package org.howe.bootgrid.web;

import org.howe.bootgrid.domain.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class DataController {

    @RequestMapping("/data")
    public List<Data> data() {
        List<Data> data = new ArrayList<>();
        int start = ThreadLocalRandom.current().nextInt(1, 10000 + 1);
        for (int i = start; i < start + 100; i++ ) {
            data.add(new Data(i, "Name " + i));
        }
        return data;
    }
}

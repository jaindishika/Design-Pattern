package com.designPattern.AdapterPattern;

import com.designPattern.AdapterPattern.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}

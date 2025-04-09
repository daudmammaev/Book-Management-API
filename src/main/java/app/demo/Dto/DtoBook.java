package app.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoBook {
    private int id;
    private String vendorCode;
    private String title;
    private int year;
    private String brand;
    private int stock;
    private int price;
}
package entity.order;

import utils.Configs;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class RushOrder extends Order {
    protected LocalDateTime rushDeliveryTime;
    public RushOrder(){
        this.lstOrderMedia = new ArrayList<>();
    }
    public RushOrder(List lstOrderMedia){
        this.lstOrderMedia = lstOrderMedia;
    }
    public LocalDateTime getRushDeliveryTime(){
        return  rushDeliveryTime;
    }

    public void setRushDeliveryTime(LocalDateTime rushDeliveryTime) {
        this.rushDeliveryTime = rushDeliveryTime;
    }

    /**
     * add media(only used for rush media)
     * @param om media to add
     */
    public void addOrderMedia(OrderMedia om){
        if(om.getMedia().isRushSupported()){
            this.lstOrderMedia.add(om);
        }
    }
    public void setDeliveryInfo(HashMap deliveryInfo) {
        super.setDeliveryInfo(deliveryInfo);
    }
    public HashMap getDeliveryInfo() {
        HashMap deliveryInfo = super.getDeliveryInfo();
        deliveryInfo.put("deliveryTime", this.rushDeliveryTime);
        return deliveryInfo;
    }

    /**
     * Calculates total fees
     * @return total fees
     */
    public int getAmount() {
        double amount = 0;
        for (Object object : lstOrderMedia) {
            OrderMedia om = (OrderMedia) object;
            amount += om.getPrice();
        }
        int totalPrice = (int) (amount + (Configs.PERCENT_VAT / 100) * amount);
        return totalPrice;
    }

}
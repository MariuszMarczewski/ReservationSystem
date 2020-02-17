package pl.mmarczewski.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Room {

    @Id
    @GeneratedValue(generator = "roomSeq")
    @SequenceGenerator(name = "roomSeq", sequenceName = "room_seq", allocationSize = 1)
    private Long id;
    private int roomType;
    private BigDecimal pricePLN;
    private BigDecimal priceEUR;

    public Room() {
    }

    public Room(Long id, int roomType, BigDecimal pricePLN, BigDecimal priceEUR) {
        this.id = id;
        this.roomType = roomType;
        this.pricePLN = pricePLN;
        this.priceEUR = priceEUR;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public int getRoomType() {
        return roomType;
    }

    public void setRoomType(int roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getPricePLN() {
        return pricePLN;
    }

    public void setPricePLN(BigDecimal pricePLN) {
        this.pricePLN = pricePLN;
    }

    public BigDecimal getPriceEUR() {
        return priceEUR;
    }

    public void setPriceEUR(BigDecimal priceEUR) {
        this.priceEUR = priceEUR;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomType=" + roomType +
                ", pricePLN=" + pricePLN +
                ", priceEUR=" + priceEUR +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomType == room.roomType &&
                Objects.equals(id, room.id) &&
                Objects.equals(pricePLN, room.pricePLN) &&
                Objects.equals(priceEUR, room.priceEUR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomType, pricePLN, priceEUR);
    }
}

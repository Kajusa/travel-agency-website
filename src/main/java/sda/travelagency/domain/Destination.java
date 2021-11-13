package sda.travelagency.domain;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Objects;

public class Destination {
    @Nullable
    private Integer idDestination;
    @NonNull
    private String DestinationName;

    public Destination() {
    }

    public Destination(@Nullable Integer idDestination, @NonNull String destinationName) {
        this.idDestination = idDestination;
        DestinationName = destinationName;
    }

    @Nullable
    public Integer getIdDestination() {
        return idDestination;
    }

    public void setIdDestination(@Nullable Integer idDestination) {
        this.idDestination = idDestination;
    }

    @NonNull
    public String getDestinationName() {
        return DestinationName;
    }

    public void setDestinationName(@NonNull String destinationName) {
        DestinationName = destinationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return Objects.equals(idDestination, that.idDestination) && DestinationName.equals(that.DestinationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDestination, DestinationName);
    }
}


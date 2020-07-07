package domain.entities;

import java.util.UUID;

public abstract class AbstractEntity {
    public UUID id;

    public UUID getId() {
        return id;
    }
}

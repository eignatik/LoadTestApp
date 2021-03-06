package org.loadx.application.db.entity;

import javax.persistence.*;

@Entity
@Table(name = "TASK_REQUESTS")
public class TaskRequests implements LoadxEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "loadTaskid")
    private int loadTaskId;
    private int loadRequestId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLoadTaskId() {
        return loadTaskId;
    }

    public void setLoadTaskId(int loadTaskId) {
        this.loadTaskId = loadTaskId;
    }

    public int getLoadRequestId() {
        return loadRequestId;
    }

    public void setLoadRequestId(int loadRequestId) {
        this.loadRequestId = loadRequestId;
    }
}

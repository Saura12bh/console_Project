package model;

import java.sql.Date;

import lombok.Data;

@Data
public class Event {
private int eid;
private String name;
private Date edate;
private String venue;
private int capacity;
}

package lab6;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

import java.util.*;

public class ConfigStorageActor extends AbstractActor {
    private void saveServerList(ServerList list) {
        data = new ArrayList<>(list.getData());
        System.out.println(data);
    }

package lab6;

import akka.actor.ActorRef;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.EventType;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;

import java.util.ArrayList;
import java.util.List;


public class ZkWatcher implements Watcher {
    private static final String SERVER_PATH = "/servers";

    public ZkWatcher(ActorRef config, ZooKeeper zk) {
        this.config = config;
        this.zk = zk;
    }

    @Override
    }
}

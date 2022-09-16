package initializers;

import initializers.packetListeners.OnItemHitAnEntityPacketListener;
import lombok.Getter;
import main.FireSwords;

public class ProtocolibPacketListenersManager {

    @Getter
    private OnItemHitAnEntityPacketListener onItemHitAnEntityPacketListener;

    private final FireSwords fireSwords;

    public ProtocolibPacketListenersManager(FireSwords fireSwords) {
        this.fireSwords = fireSwords;
        this.initPacektListeners();
    }

    private void initPacektListeners() {
        this.onItemHitAnEntityPacketListener = new OnItemHitAnEntityPacketListener(this.fireSwords);
    }
}

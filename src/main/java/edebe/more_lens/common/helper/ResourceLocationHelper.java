package edebe.more_lens.common.helper;

import edebe.more_lens.api.MoreLensAPI;
import net.minecraft.util.ResourceLocation;

public interface ResourceLocationHelper {
    static ResourceLocation prefix(String path) {
        return new ResourceLocation(MoreLensAPI.MOD_ID, path);
    }
}

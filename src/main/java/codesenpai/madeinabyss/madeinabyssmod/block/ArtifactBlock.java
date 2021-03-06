package codesenpai.madeinabyss.madeinabyssmod.block;

import codesenpai.madeinabyss.madeinabyssmod.init.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static codesenpai.madeinabyss.madeinabyssmod.init.Blocks.getDrop;

public class ArtifactBlock extends Block
{

    public ArtifactBlock()
    {
        super(Material.ROCK);
        setCreativeTab(CreativeTab.tab);
        setLightLevel(0.5F);
        setHardness(5);
        setResistance(100);
        setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return getDrop(1, rand, fortune);
    }


}

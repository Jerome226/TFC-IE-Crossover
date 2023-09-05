package com.nmagpie.tfc_ie_addon.common.blocks;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import com.nmagpie.tfc_ie_addon.common.items.Items;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import net.dries007.tfc.common.fluids.FlowingFluidRegistryObject;
import net.dries007.tfc.common.fluids.MoltenFluid;
import net.dries007.tfc.util.Helpers;
import net.dries007.tfc.util.registry.RegistrationHelpers;

import static com.nmagpie.tfc_ie_addon.TFC_IE_Addon.*;
import static net.dries007.tfc.common.fluids.TFCFluids.*;

public class Fluids
{
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, MOD_ID);

    private static <F extends FlowingFluid> FlowingFluidRegistryObject<F> register(String sourceName, String flowingName, Consumer<ForgeFlowingFluid.Properties> builder, FluidAttributes.Builder attributes, Function<ForgeFlowingFluid.Properties, F> sourceFactory, Function<ForgeFlowingFluid.Properties, F> flowingFactory)
    {
        return RegistrationHelpers.registerFluid(FLUIDS, sourceName, flowingName, builder, attributes, sourceFactory, flowingFactory);
    }
}

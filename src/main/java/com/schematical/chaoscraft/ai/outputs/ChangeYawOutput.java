package com.schematical.chaoscraft.ai.outputs;

import com.schematical.chaoscraft.ChaosCraft;
import com.schematical.chaoscraft.ai.OutputNeuron;

/**
 * Created by user1a on 12/10/18.
 */
public class ChangeYawOutput extends OutputNeuron {
    @Override
    public void execute() {

        float delta = reverseSigmoid(getCurrentValue());

        if(Math.abs(delta) < ChaosCraft.activationThreshold){
            return;
        }


        this.nNet.entity.setDesiredYaw(this.nNet.entity.rotationYaw + (delta  * 30));



    }
}

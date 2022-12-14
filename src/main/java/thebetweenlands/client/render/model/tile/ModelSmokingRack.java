package thebetweenlands.client.render.model.tile;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelSmokingRack extends ModelBase {
    ModelRenderer base;
    ModelRenderer support_front_left1a;
    ModelRenderer support_back_left1a;
    ModelRenderer support_front_right1a;
    ModelRenderer support_back_right1a;
    ModelRenderer beam_top;
    ModelRenderer beam_front;
    ModelRenderer beam_back;
    ModelRenderer netting_left;
    ModelRenderer netting_right;
    ModelRenderer support_front_left1b;
    ModelRenderer support_front_left1c;
    ModelRenderer support_front_left1d;
    ModelRenderer support_back_left1b;
    ModelRenderer support_back_left1c;
    ModelRenderer support_back_left1d;
    ModelRenderer support_front_right1b;
    ModelRenderer support_front_right1c;
    ModelRenderer support_front_right1d;
    ModelRenderer support_back_right1b;
    ModelRenderer support_back_right1c;
    ModelRenderer support_back_right1d;
    ModelRenderer rope_top_left;
    ModelRenderer rope_top_right;
    ModelRenderer connection_top;
    ModelRenderer hook_top;
    ModelRenderer rope_front_left;
    ModelRenderer rope_front_right;
    ModelRenderer connection_front;
    ModelRenderer hook_front;
    ModelRenderer rope_back_left;
    ModelRenderer rope_back_right;
    ModelRenderer connection_back;
    ModelRenderer hook_back;

    public ModelSmokingRack() {
        textureWidth = 64;
        textureHeight = 64;
        connection_back = new ModelRenderer(this, 36, 28);
        connection_back.setRotationPoint(0.0F, 1.0F, 1.0F);
        connection_back.addBox(-0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
        setRotateAngle(connection_back, -0.22759093446006054F, 0.0F, 0.0F);
        support_back_right1a = new ModelRenderer(this, 27, 0);
        support_back_right1a.setRotationPoint(-7.0F, 0.0F, 8.0F);
        support_back_right1a.addBox(0.0F, -8.0F, -2.0F, 2, 8, 2, 0.0F);
        support_front_left1b = new ModelRenderer(this, 0, 11);
        support_front_left1b.setRotationPoint(-0.01F, -8.0F, 0.0F);
        support_front_left1b.addBox(-2.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_front_left1b, -0.136659280431156F, 0.0F, 0.0F);
        support_back_left1b = new ModelRenderer(this, 9, 11);
        support_back_left1b.setRotationPoint(-0.01F, -8.0F, 0.0F);
        support_back_left1b.addBox(-2.0F, -8.0F, -2.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_back_left1b, 0.136659280431156F, 0.0F, 0.0F);
        support_back_left1c = new ModelRenderer(this, 9, 22);
        support_back_left1c.setRotationPoint(-0.01F, -8.0F, 0.0F);
        support_back_left1c.addBox(-2.0F, -8.0F, -2.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_back_left1c, 0.136659280431156F, 0.0F, 0.0F);
        rope_back_right = new ModelRenderer(this, 49, 14);
        rope_back_right.setRotationPoint(-6.0F, 0.0F, 0.0F);
        rope_back_right.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        setRotateAngle(rope_back_right, -0.045553093477052F, -0.045553093477052F, -0.045553093477052F);
        rope_top_left = new ModelRenderer(this, 36, 0);
        rope_top_left.setRotationPoint(6.0F, 0.0F, 0.0F);
        rope_top_left.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        setRotateAngle(rope_top_left, -0.091106186954104F, 0.0F, 0.091106186954104F);
        support_front_left1d = new ModelRenderer(this, 0, 33);
        support_front_left1d.setRotationPoint(-0.01F, -8.0F, 0.0F);
        support_front_left1d.addBox(-2.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_front_left1d, -0.136659280431156F, 0.0F, 0.0F);
        netting_left = new ModelRenderer(this, 37, 19);
        netting_left.setRotationPoint(6.5F, -17.0F, 0.0F);
        netting_left.addBox(0.0F, 0.0F, -6.0F, 0, 14, 12, 0.0F);
        rope_back_left = new ModelRenderer(this, 36, 14);
        rope_back_left.setRotationPoint(6.0F, 0.0F, 0.0F);
        rope_back_left.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        setRotateAngle(rope_back_left, 0.091106186954104F, 0.0F, 0.091106186954104F);
        support_back_right1b = new ModelRenderer(this, 27, 11);
        support_back_right1b.setRotationPoint(0.01F, -8.0F, 0.0F);
        support_back_right1b.addBox(0.0F, -8.0F, -2.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_back_right1b, 0.136659280431156F, 0.0F, 0.0F);
        connection_front = new ModelRenderer(this, 36, 25);
        connection_front.setRotationPoint(0.0F, 1.0F, -1.0F);
        connection_front.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        setRotateAngle(connection_front, 0.22759093446006054F, 0.0F, 0.0F);
        netting_right = new ModelRenderer(this, 37, 34);
        netting_right.setRotationPoint(-6.5F, -17.0F, 0.0F);
        netting_right.addBox(0.0F, 0.0F, -6.0F, 0, 14, 12, 0.0F);
        support_front_left1a = new ModelRenderer(this, 0, 0);
        support_front_left1a.setRotationPoint(7.0F, 0.0F, -8.0F);
        support_front_left1a.addBox(-2.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
        rope_front_right = new ModelRenderer(this, 49, 7);
        rope_front_right.setRotationPoint(-6.0F, 0.0F, 0.0F);
        rope_front_right.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        setRotateAngle(rope_front_right, -0.045553093477052F, 0.045553093477052F, 0.0F);
        beam_front = new ModelRenderer(this, 0, 49);
        beam_front.setRotationPoint(0.0F, -16.0F, -6.0F);
        beam_front.addBox(-8.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        setRotateAngle(beam_front, -0.22759093446006054F, 0.0F, 0.0F);
        support_front_right1d = new ModelRenderer(this, 18, 33);
        support_front_right1d.setRotationPoint(0.01F, -8.0F, 0.0F);
        support_front_right1d.addBox(0.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_front_right1d, -0.136659280431156F, 0.0F, 0.0F);
        support_back_left1a = new ModelRenderer(this, 9, 0);
        support_back_left1a.setRotationPoint(7.0F, 0.0F, 8.0F);
        support_back_left1a.addBox(-2.0F, -8.0F, -2.0F, 2, 8, 2, 0.0F);
        support_back_left1d = new ModelRenderer(this, 9, 33);
        support_back_left1d.setRotationPoint(-0.01F, -8.0F, 0.0F);
        support_back_left1d.addBox(-2.0F, -8.0F, -2.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_back_left1d, 0.136659280431156F, 0.0F, 0.0F);
        support_back_right1c = new ModelRenderer(this, 27, 22);
        support_back_right1c.setRotationPoint(0.01F, -8.0F, 0.0F);
        support_back_right1c.addBox(0.0F, -8.0F, -2.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_back_right1c, 0.136659280431156F, 0.0F, 0.0F);
        connection_top = new ModelRenderer(this, 36, 21);
        connection_top.setRotationPoint(0.0F, 1.0F, -1.0F);
        connection_top.addBox(-0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F);
        setRotateAngle(connection_top, -0.7853981633974483F, 0.0F, 0.0F);
        hook_front = new ModelRenderer(this, 48, 18);
        hook_front.setRotationPoint(0.0F, 1.0F, 0.5F);
        hook_front.addBox(0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F);
        setRotateAngle(hook_front, 0.0F, 0.5009094953223726F, 0.0F);
        beam_back = new ModelRenderer(this, 0, 54);
        beam_back.setRotationPoint(0.0F, -16.0F, 6.0F);
        beam_back.addBox(-8.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        setRotateAngle(beam_back, 0.22759093446006054F, 0.0F, 0.0F);
        rope_top_right = new ModelRenderer(this, 49, 0);
        rope_top_right.setRotationPoint(-6.0F, 0.0F, 0.0F);
        rope_top_right.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        setRotateAngle(rope_top_right, 0.091106186954104F, -0.045553093477052F, 0.0F);
        rope_front_left = new ModelRenderer(this, 36, 7);
        rope_front_left.setRotationPoint(6.0F, 0.0F, 0.0F);
        rope_front_left.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3, 0.0F);
        setRotateAngle(rope_front_left, 0.0F, -0.045553093477052F, 0.045553093477052F);
        support_front_right1b = new ModelRenderer(this, 18, 11);
        support_front_right1b.setRotationPoint(0.01F, -8.0F, 0.0F);
        support_front_right1b.addBox(0.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_front_right1b, -0.136659280431156F, 0.0F, 0.0F);
        hook_top = new ModelRenderer(this, 41, 18);
        hook_top.setRotationPoint(0.0F, 1.0F, 0.0F);
        hook_top.addBox(0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F);
        setRotateAngle(hook_top, 0.0F, -1.2292353921796064F, 0.0F);
        hook_back = new ModelRenderer(this, 55, 18);
        hook_back.setRotationPoint(0.0F, 1.0F, -0.5F);
        hook_back.addBox(0.0F, 0.0F, -1.5F, 0, 3, 3, 0.0F);
        setRotateAngle(hook_back, 0.0F, -0.31869712141416456F, 0.0F);
        base = new ModelRenderer(this, 0, 0);
        base.setRotationPoint(0.0F, 24.0F, 0.0F);
        base.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        support_back_right1d = new ModelRenderer(this, 27, 33);
        support_back_right1d.setRotationPoint(0.01F, -8.0F, 0.0F);
        support_back_right1d.addBox(0.0F, -8.0F, -2.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_back_right1d, 0.136659280431156F, 0.0F, 0.0F);
        support_front_left1c = new ModelRenderer(this, 0, 22);
        support_front_left1c.setRotationPoint(-0.01F, -8.0F, 0.0F);
        support_front_left1c.addBox(-2.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_front_left1c, -0.136659280431156F, 0.0F, 0.0F);
        beam_top = new ModelRenderer(this, 0, 44);
        beam_top.setRotationPoint(0.0F, -30.5F, 0.0F);
        beam_top.addBox(-8.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        setRotateAngle(beam_top, 0.7853981633974483F, 0.0F, 0.0F);
        support_front_right1c = new ModelRenderer(this, 18, 22);
        support_front_right1c.setRotationPoint(0.01F, -8.0F, 0.0F);
        support_front_right1c.addBox(0.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
        setRotateAngle(support_front_right1c, -0.136659280431156F, 0.0F, 0.0F);
        support_front_right1a = new ModelRenderer(this, 18, 0);
        support_front_right1a.setRotationPoint(-7.0F, 0.0F, -8.0F);
        support_front_right1a.addBox(0.0F, -8.0F, 0.0F, 2, 8, 2, 0.0F);
        beam_back.addChild(connection_back);
        base.addChild(support_back_right1a);
        support_front_left1a.addChild(support_front_left1b);
        support_back_left1a.addChild(support_back_left1b);
        support_back_left1b.addChild(support_back_left1c);
        beam_back.addChild(rope_back_right);
        beam_top.addChild(rope_top_left);
        support_front_left1c.addChild(support_front_left1d);
        base.addChild(netting_left);
        beam_back.addChild(rope_back_left);
        support_back_right1a.addChild(support_back_right1b);
        beam_front.addChild(connection_front);
        base.addChild(netting_right);
        base.addChild(support_front_left1a);
        beam_front.addChild(rope_front_right);
        base.addChild(beam_front);
        support_front_right1c.addChild(support_front_right1d);
        base.addChild(support_back_left1a);
        support_back_left1c.addChild(support_back_left1d);
        support_back_right1b.addChild(support_back_right1c);
        beam_top.addChild(connection_top);
        connection_front.addChild(hook_front);
        base.addChild(beam_back);
        beam_top.addChild(rope_top_right);
        beam_front.addChild(rope_front_left);
        support_front_right1a.addChild(support_front_right1b);
        connection_top.addChild(hook_top);
        connection_back.addChild(hook_back);
        support_back_right1c.addChild(support_back_right1d);
        support_front_left1b.addChild(support_front_left1c);
        base.addChild(beam_top);
        support_front_right1b.addChild(support_front_right1c);
        base.addChild(support_front_right1a);
    }

    public void render() { 
        base.render(0.0625F);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

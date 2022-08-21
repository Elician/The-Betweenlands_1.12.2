package thebetweenlands.client.render.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import thebetweenlands.common.entity.draeton.EntityDraeton;

/**
 * BLDraetonAddonStorage - TripleHeadedSheep
 * Created using Tabula 7.0.1
 */
public class ModelDraetonUpgradeStorage extends ModelBase {
	public ModelRenderer storage_main;
	public ModelRenderer storage_bottom;
	public ModelRenderer rope_top1;
	public ModelRenderer rope_top2;
	public ModelRenderer pouch1;
	public ModelRenderer pouch2;
	public ModelRenderer storage_lid;

	public ModelDraetonUpgradeStorage() {
		this.textureWidth = 32;
		this.textureHeight = 32;
		this.storage_main = new ModelRenderer(this, 0, 0);
		this.storage_main.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.storage_main.addBox(0.0F, -2.0F, -4.0F, 6, 4, 8, 0.0F);
		this.setRotateAngle(storage_main, 0.0F, 0.0F, 0.18203784098300857F);
		this.pouch1 = new ModelRenderer(this, 21, 13);
		this.pouch1.setRotationPoint(3.0F, 1.0F, 4.0F);
		this.pouch1.addBox(-1.5F, 0.0F, 0.0F, 3, 5, 2, 0.0F);
		this.setRotateAngle(pouch1, -0.136659280431156F, 0.0F, 0.0F);
		this.rope_top1 = new ModelRenderer(this, 0, 28);
		this.rope_top1.setRotationPoint(6.0F, 0.0F, 4.0F);
		this.rope_top1.addBox(-7.0F, -1.0F, 0.0F, 7, 1, 0, 0.0F);
		this.setRotateAngle(rope_top1, 0.0F, 0.18203784098300857F, 0.0F);
		this.storage_bottom = new ModelRenderer(this, 0, 14);
		this.storage_bottom.setRotationPoint(6.0F, 2.0F, 0.0F);
		this.storage_bottom.addBox(-6.0F, 0.0F, -4.0F, 6, 5, 8, 0.0F);
		this.setRotateAngle(storage_bottom, 0.0F, 0.0F, 0.136659280431156F);
		this.pouch2 = new ModelRenderer(this, 21, 0);
		this.pouch2.setRotationPoint(3.0F, 1.0F, -4.0F);
		this.pouch2.addBox(-1.5F, 0.0F, -2.0F, 3, 4, 2, 0.0F);
		this.setRotateAngle(pouch2, 0.091106186954104F, 0.0F, 0.0F);
		this.storage_lid = new ModelRenderer(this, 0, 13);
		this.storage_lid.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.storage_lid.addBox(0.0F, -1.0F, -4.0F, 6, 1, 8, 0.0F);
		this.rope_top2 = new ModelRenderer(this, 0, 30);
		this.rope_top2.setRotationPoint(6.0F, 0.0F, -4.0F);
		this.rope_top2.addBox(-7.0F, -1.0F, 0.0F, 7, 1, 0, 0.0F);
		this.setRotateAngle(rope_top2, 0.0F, -0.18203784098300857F, 0.0F);
		this.storage_main.addChild(this.pouch1);
		this.storage_main.addChild(this.rope_top1);
		this.storage_main.addChild(this.storage_bottom);
		this.storage_main.addChild(this.pouch2);
		this.storage_main.addChild(this.storage_lid);
		this.storage_main.addChild(this.rope_top2);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if(entityIn instanceof EntityDraeton) {
			float lidAngle = ((EntityDraeton)entityIn).upgradeOpenTicks / 5.0f;
			lidAngle = 1.0F - lidAngle;
			lidAngle = 1.0F - lidAngle * lidAngle * lidAngle;
			this.storage_lid.rotateAngleZ = -lidAngle * 0.9f;

			float roll = (float)Math.toRadians(((EntityDraeton) entityIn).upgradeCounterRoll);

			this.storage_main.rotateAngleZ = 0.18203784098300857F - roll;
		} else {
			this.storage_lid.rotateAngleZ = 0;
			this.storage_main.rotateAngleZ = 0.18203784098300857F;
		}
		this.storage_main.render(scale);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}

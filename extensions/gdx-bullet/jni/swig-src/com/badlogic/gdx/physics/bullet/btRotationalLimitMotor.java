/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btRotationalLimitMotor extends BulletBase {
	private long swigCPtr;
	
	protected btRotationalLimitMotor(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btRotationalLimitMotor(long cPtr, boolean cMemoryOwn) {
		this("btRotationalLimitMotor", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btRotationalLimitMotor obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btRotationalLimitMotor(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setLoLimit(float value) {
    gdxBulletJNI.btRotationalLimitMotor_loLimit_set(swigCPtr, this, value);
  }

  public float getLoLimit() {
    return gdxBulletJNI.btRotationalLimitMotor_loLimit_get(swigCPtr, this);
  }

  public void setHiLimit(float value) {
    gdxBulletJNI.btRotationalLimitMotor_hiLimit_set(swigCPtr, this, value);
  }

  public float getHiLimit() {
    return gdxBulletJNI.btRotationalLimitMotor_hiLimit_get(swigCPtr, this);
  }

  public void setTargetVelocity(float value) {
    gdxBulletJNI.btRotationalLimitMotor_targetVelocity_set(swigCPtr, this, value);
  }

  public float getTargetVelocity() {
    return gdxBulletJNI.btRotationalLimitMotor_targetVelocity_get(swigCPtr, this);
  }

  public void setMaxMotorForce(float value) {
    gdxBulletJNI.btRotationalLimitMotor_maxMotorForce_set(swigCPtr, this, value);
  }

  public float getMaxMotorForce() {
    return gdxBulletJNI.btRotationalLimitMotor_maxMotorForce_get(swigCPtr, this);
  }

  public void setMaxLimitForce(float value) {
    gdxBulletJNI.btRotationalLimitMotor_maxLimitForce_set(swigCPtr, this, value);
  }

  public float getMaxLimitForce() {
    return gdxBulletJNI.btRotationalLimitMotor_maxLimitForce_get(swigCPtr, this);
  }

  public void setDamping(float value) {
    gdxBulletJNI.btRotationalLimitMotor_damping_set(swigCPtr, this, value);
  }

  public float getDamping() {
    return gdxBulletJNI.btRotationalLimitMotor_damping_get(swigCPtr, this);
  }

  public void setLimitSoftness(float value) {
    gdxBulletJNI.btRotationalLimitMotor_limitSoftness_set(swigCPtr, this, value);
  }

  public float getLimitSoftness() {
    return gdxBulletJNI.btRotationalLimitMotor_limitSoftness_get(swigCPtr, this);
  }

  public void setNormalCFM(float value) {
    gdxBulletJNI.btRotationalLimitMotor_normalCFM_set(swigCPtr, this, value);
  }

  public float getNormalCFM() {
    return gdxBulletJNI.btRotationalLimitMotor_normalCFM_get(swigCPtr, this);
  }

  public void setStopERP(float value) {
    gdxBulletJNI.btRotationalLimitMotor_stopERP_set(swigCPtr, this, value);
  }

  public float getStopERP() {
    return gdxBulletJNI.btRotationalLimitMotor_stopERP_get(swigCPtr, this);
  }

  public void setStopCFM(float value) {
    gdxBulletJNI.btRotationalLimitMotor_stopCFM_set(swigCPtr, this, value);
  }

  public float getStopCFM() {
    return gdxBulletJNI.btRotationalLimitMotor_stopCFM_get(swigCPtr, this);
  }

  public void setBounce(float value) {
    gdxBulletJNI.btRotationalLimitMotor_bounce_set(swigCPtr, this, value);
  }

  public float getBounce() {
    return gdxBulletJNI.btRotationalLimitMotor_bounce_get(swigCPtr, this);
  }

  public void setEnableMotor(boolean value) {
    gdxBulletJNI.btRotationalLimitMotor_enableMotor_set(swigCPtr, this, value);
  }

  public boolean getEnableMotor() {
    return gdxBulletJNI.btRotationalLimitMotor_enableMotor_get(swigCPtr, this);
  }

  public void setCurrentLimitError(float value) {
    gdxBulletJNI.btRotationalLimitMotor_currentLimitError_set(swigCPtr, this, value);
  }

  public float getCurrentLimitError() {
    return gdxBulletJNI.btRotationalLimitMotor_currentLimitError_get(swigCPtr, this);
  }

  public void setCurrentPosition(float value) {
    gdxBulletJNI.btRotationalLimitMotor_currentPosition_set(swigCPtr, this, value);
  }

  public float getCurrentPosition() {
    return gdxBulletJNI.btRotationalLimitMotor_currentPosition_get(swigCPtr, this);
  }

  public void setCurrentLimit(int value) {
    gdxBulletJNI.btRotationalLimitMotor_currentLimit_set(swigCPtr, this, value);
  }

  public int getCurrentLimit() {
    return gdxBulletJNI.btRotationalLimitMotor_currentLimit_get(swigCPtr, this);
  }

  public void setAccumulatedImpulse(float value) {
    gdxBulletJNI.btRotationalLimitMotor_accumulatedImpulse_set(swigCPtr, this, value);
  }

  public float getAccumulatedImpulse() {
    return gdxBulletJNI.btRotationalLimitMotor_accumulatedImpulse_get(swigCPtr, this);
  }

  public btRotationalLimitMotor() {
    this(gdxBulletJNI.new_btRotationalLimitMotor__SWIG_0(), true);
  }

  public btRotationalLimitMotor(btRotationalLimitMotor limot) {
    this(gdxBulletJNI.new_btRotationalLimitMotor__SWIG_1(btRotationalLimitMotor.getCPtr(limot), limot), true);
  }

  public boolean isLimited() {
    return gdxBulletJNI.btRotationalLimitMotor_isLimited(swigCPtr, this);
  }

  public boolean needApplyTorques() {
    return gdxBulletJNI.btRotationalLimitMotor_needApplyTorques(swigCPtr, this);
  }

  public int testLimitValue(float test_value) {
    return gdxBulletJNI.btRotationalLimitMotor_testLimitValue(swigCPtr, this, test_value);
  }

  public float solveAngularLimits(float timeStep, Vector3 axis, float jacDiagABInv, btRigidBody body0, btRigidBody body1) {
    return gdxBulletJNI.btRotationalLimitMotor_solveAngularLimits(swigCPtr, this, timeStep, axis, jacDiagABInv, btRigidBody.getCPtr(body0), body0, btRigidBody.getCPtr(body1), body1);
  }

}

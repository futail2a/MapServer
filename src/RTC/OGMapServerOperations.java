package RTC;


/**
* RTC/OGMapServerOperations.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2014�N8��11�� 11��47��26�b JST
*/


/*!
   * @interface OGMapServer
   * @brief Occupancy Grid Map Service Interface
   */
public interface OGMapServerOperations 
{

  /// Request Current Build Map Data
  RTC.RETURN_VALUE requestCurrentBuiltMap (RTC.OGMapHolder map);
} // interface OGMapServerOperations
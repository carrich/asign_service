/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service11;

public interface HelloWorld extends java.rmi.Remote {
    public service11.Member register(service11.Member arg0) throws java.rmi.RemoteException;
    public service11.City[] getAllCity() throws java.rmi.RemoteException;
    public service11.City getOneCity(long arg0) throws java.rmi.RemoteException;
    public service11.District[] getAllDistrict() throws java.rmi.RemoteException;
    public service11.District getOneDistrict(long arg0) throws java.rmi.RemoteException;
    public service11.Place[] getAllPlace() throws java.rmi.RemoteException;
    public service11.Place getDetailPlace(long arg0) throws java.rmi.RemoteException;
    public service11.CommentDto[] getCommentRating(long arg0) throws java.rmi.RemoteException;
    public service11.Place createPlace(service11.Place arg0) throws java.rmi.RemoteException;
    public service11.Rating createRating(service11.Rating arg0) throws java.rmi.RemoteException;
    public service11.Rating[] getRatingByPlaceId(long arg0) throws java.rmi.RemoteException;
    public service11.Comment createComment(service11.Comment arg0) throws java.rmi.RemoteException;
    public service11.Comment[] getCommentByPlaceId(int arg0) throws java.rmi.RemoteException;
    public service11.Member login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public service11.Place[] getPlaceByCityId(long arg0) throws java.rmi.RemoteException;
    public service11.Place[] getPlaceByDistrictId(long arg0) throws java.rmi.RemoteException;
    public service11.Place[] getPlaceByName(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String sayHelloWorldFrom(java.lang.String arg0) throws java.rmi.RemoteException;
}

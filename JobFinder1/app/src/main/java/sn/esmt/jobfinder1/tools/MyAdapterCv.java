package sn.esmt.jobfinder1.tools;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import sn.esmt.jobfinder1.R;
import sn.esmt.jobfinder1.httpconfig.CvsResponse;

public class MyAdapterCv extends BaseAdapter {
    private ArrayList<CvsResponse> cvs;
    private LayoutInflater myInflater;

    public MyAdapterCv(Context context, ArrayList<CvsResponse> cvs)
    {
        this.myInflater = LayoutInflater.from(context);
        this.cvs = cvs;
    }


    @Override
    public int getCount() {
        return this.cvs.size();
    }

    @Override
    public Object getItem(int arg0) {
        return cvs.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
        public static class ViewHolder {
            TextView textid;
            TextView textnom;
            TextView textprenom;
            TextView textage;
            TextView textadresse;
            TextView textemail;
            TextView texttelephone;
            TextView textspecialite;
            TextView textniveauEtude;
            TextView textexperiencePro;

        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null){
            convertView = myInflater.inflate(R.layout.listitem_cv, null);
            holder = new ViewHolder();
            holder.textid = (TextView) convertView.findViewById(R.id.txtid);
            //holder.textid.setText(String.valueOf(cvs.get(position).getId()));
            holder.textnom = (TextView) convertView.findViewById(R.id.txtnom);
            holder.textprenom = (TextView) convertView.findViewById(R.id.txtprenom);
            holder.textage = (TextView) convertView.findViewById(R.id.txtage);
            holder.textadresse = (TextView) convertView.findViewById(R.id.txtadresse);
            holder.textemail = (TextView) convertView.findViewById(R.id.txtemail);
            holder.texttelephone = (TextView) convertView.findViewById(R.id.txttelephone);
            holder.textspecialite = (TextView) convertView.findViewById(R.id.txtspecialite);
            holder.textniveauEtude = (TextView) convertView.findViewById(R.id.txtniveauEtude);
            holder.textexperiencePro = (TextView) convertView.findViewById(R.id.txtexperiencePro);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        //holder.textid.setText(cvs.get(position).getId()+"");
        holder.textid.setText(String.valueOf(cvs.get(position).getId()));
        holder.textnom.setText(cvs.get(position).getNom());
        holder.textprenom.setText(cvs.get(position).getPrenom());
        //holder.textage.setText(cvs.get(position).getAge());
        holder.textage.setText(String.valueOf(cvs.get(position).getAge()));
        holder.textadresse.setText(cvs.get(position).getAdresse());
        holder.textemail.setText(cvs.get(position).getEmail());
        holder.texttelephone.setText(cvs.get(position).getTelephone());
        holder.textspecialite.setText(cvs.get(position).getSpecialite());
        holder.textniveauEtude.setText(cvs.get(position).getNiveauEtude());
        holder.textexperiencePro.setText(cvs.get(position).getExperiencePro());
        return convertView;
    }
}
